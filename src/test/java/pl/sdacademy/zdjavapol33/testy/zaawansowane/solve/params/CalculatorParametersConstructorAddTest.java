package pl.sdacademy.zdjavapol33.testy.zaawansowane.solve.params;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pl.sdacademy.zdjavapol33.testy.zaawansowane.solve.calculator.Calculator;
import pl.sdacademy.zdjavapol33.testy.zaawansowane.solve.calculator.CalculatorImpl;

import java.util.Collection;

import static org.junit.Assert.assertEquals;

// Adnotacja określająca wartości parametryzowane
@RunWith(value = Parameterized.class)
public class CalculatorParametersConstructorAddTest {


    private int numberB;
    private String expectedResult;
    private int numberA;

    public CalculatorParametersConstructorAddTest(int numberA, int numberB, String expectedResult){
        this.numberA = numberA;
        this.numberB = numberB;
        this.expectedResult = expectedResult;
    }

    // Dzięki tej adnotacji test wie skąd wziąść dane do testów
    @Parameterized.Parameters(name = "Test {index}: {0} + {1} = {2}")
    public static Collection<Object> data(){
        return Arrays.asList(new Object[][]{
                {1,2,"3"},
                {2,3,"5"},
                {7,2,"9"},
                {6,6,"12"},
                {1,8,"9"}
        });
    }

    @Test
    public void shouldAddSuccessExcuteTest(){

        // given
        Calculator calc = new CalculatorImpl();

        // when
        calc.add(numberA, numberB);

        // then
        String resultDisplay = calc.display();
        String message = numberA+"+"+numberB+" must be equal "+expectedResult;

        assertEquals(message,expectedResult, resultDisplay);
    }
}
