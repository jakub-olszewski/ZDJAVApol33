package pl.sdacademy.zdjavapol33.testy.zaawansowane.solve.params;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pl.sdacademy.zdjavapol33.testy.zaawansowane.solve.calculator.Calculator;
import pl.sdacademy.zdjavapol33.testy.zaawansowane.solve.calculator.CalculatorImpl;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CalculatorParametizedJUnitParamsMethodTest {


    private Object[] parametersToTestAdd(){
        return new Object[]{
                new Object[]{1,2,3},
                new Object[]{2,3,5},
                new Object[]{4,2,6}
        };
    }

    @Test
    @Parameters(method = "parametersToTestAdd")
    public void testAdd(int numberA, int numberB, String expected){

        // given
        Calculator calc = new CalculatorImpl();

        // when
        calc.add(numberA,numberB);

        // then
        String message = String.format("Error %d + %d != %s because is equal %s",
                numberA,numberB,calc.display(),expected);
        assertEquals(message,expected,calc.display());
    }

}
