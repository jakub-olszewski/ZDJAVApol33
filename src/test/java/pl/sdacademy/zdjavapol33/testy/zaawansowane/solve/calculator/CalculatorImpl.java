package pl.sdacademy.zdjavapol33.testy.zaawansowane.solve.calculator;

public class CalculatorImpl implements Calculator {
    public static String DIV_ERROR_MESSAGE = "Nie dziel przez zero";

    String display;

    public CalculatorImpl(){
        display = "";
    }

    @Override
    public void pressNumber(int number) {
        display += number;
    }

    @Override
    public String display() {
        return display;
    }

    @Override
    public void add(int numberA, int numberB) {
        display += numberA + numberB;
    }

    @Override
    public void clear() {
        display = "";
    }

    @Override
    public void sub(int numberA, int numberB) {
        // += dopisanie
        display += numberA - numberB;
    }

    @Override
    public void multi(int numberA, int numberB) {
        display += numberA * numberB;
    }

    @Override
    public void div(int numberA, int numberB) {

        // implementacje zrzucanie wyjatku IllegalArgumentException
        // podczas dzielenia przez zero
        if(numberB==0){
            throw new IllegalArgumentException(DIV_ERROR_MESSAGE);
            //throw CalculatorException.divide();
        }else
        {
            display += numberA / numberB;
        }

    }
}
