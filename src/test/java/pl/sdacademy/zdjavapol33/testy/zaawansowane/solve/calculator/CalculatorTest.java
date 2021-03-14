package pl.sdacademy.zdjavapol33.testy.zaawansowane.solve.calculator;

import net.bytebuddy.pool.TypePool;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Stwórz testy metod:
 * pressNumber(), display(),
 * add(), sub(), div(), multi() [+, -, / , * ]
 **/
@RunWith(JUnit4.class)// obecność tej linii jest domyślna
public class CalculatorTest {

    Calculator calc;

    @Before
    public void before(){
        // given
        calc = new CalculatorImpl();
    }

    /**
     * Test wciśnięcia przycisku "0" i sprawdzenie
     * czy na wyświetlacz jest wyświetlone "0"
     */
    @Test
    public void pressNumber0Test(){


        // when
        calc.pressNumber(0);

        // then
        String expected = "0";
        String result = calc.display();

        // sprawdzanie
        assertEquals("Must be only zero on display!",expected,result);
    }

    /**
     * Test pustego wyświetlacza
     */
    @Test
    public void emptyDisplayTest(){

        // when
        // nic nie robimy z kalkulatorem, bo display ma być pusty!

        // then

        // opcja 1
        String result = calc.display();
        String expected = "";
        assertEquals("Display must be empty!",expected,result);

        // opcja 2 - zalecana
        assertTrue("Display must be empty!",calc.display().isEmpty());

    }

    @Test
    public void shouldDisplay7WhenAdd3And4Test(){

        // when
        calc.add(3,4);

        // then
        String result = calc.display();
        String expected = "7";

        assertEquals("Display must contain 7!",expected,result);
    }

    @Test
    public void shouldDisplay1WhenSub5And4Test(){
        // when
        calc.sub(5,4);

        // then
        String result = calc.display();
        String expected = "1";

        assertEquals("Display must contain 1!",expected,result);
    }

    @Test
    public void shouldAddSuccessedExecute(){

        //when1
        calc.clear();
        calc.add(3,4);

        //then1
        // opcja 1
        assertEquals("7",calc.display());
        // opcja 2
        //assertTrue(calc.display().equals("7"));

        //when2
        calc.clear();
        calc.add(1,4);

        //then2
        assertEquals("5",calc.display());

        //when3
        calc.clear();
        calc.add(0,4);

        //then3
        assertEquals("4",calc.display());

        //when4
        calc.clear();
        calc.add(7,4);

        //then4
        assertEquals("11",calc.display());

        //when5
        calc.clear();
        calc.add(9,1);

        //then5
        assertEquals("10",calc.display());
    }

    @Test
    public void shouldSubSuccessedExecute(){

        //when1
        calc.clear();
        calc.sub(3,4);

        //then1
        // opcja 1
        assertEquals("-1",calc.display());
        // opcja 2
        //assertTrue(calc.display().equals("7"));

        //when2
        calc.clear();
        calc.sub(1,4);

        //then2
        assertEquals("-3",calc.display());

        //when3
        calc.clear();
        calc.sub(0,4);

        //then3
        assertEquals("-4",calc.display());

        //when4
        calc.clear();
        calc.sub(7,4);

        //then4
        assertEquals("3",calc.display());

        //when5
        calc.clear();
        calc.sub(9,1);

        //then5
        assertEquals("8",calc.display());
    }

    /**
     * Testowanie wyjątku zasadach ogólnych
     */
    @Test(expected = IllegalArgumentException.class)
    public void shouldDisplayErrorWhenDivByZeroTest(){

        // when
        calc.div(13,0);

        // then
    }

    /**
     * Testowanie wyjątku z użyciem asercji
     */
    @Test
    public void shouldDisplayErrorWhenDivByZero2Test(){

        // when
        try {
            calc.div(13, 0);
        }catch (Exception e){
            assertTrue(e instanceof IllegalArgumentException);
            assertTrue(e.getMessage().contains(CalculatorImpl.DIV_ERROR_MESSAGE));
        }
        // then
    }


    @Rule
    public ExpectedException expectedException = ExpectedException.none();


    /**
     * Testowanie wyjątku z użyciem reguły @Rule
     */
    @Test
    public void shouldDisplayErrorWhenDivByZero3Test(){
        // then
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage(CalculatorImpl.DIV_ERROR_MESSAGE);

        // when
        calc.div(3,0);
    }


}
