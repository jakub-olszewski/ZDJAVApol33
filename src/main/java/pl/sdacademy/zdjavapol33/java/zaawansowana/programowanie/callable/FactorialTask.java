package pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie.callable;

import java.util.concurrent.Callable;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 22.05.2020
 **/
public class FactorialTask implements Callable<Integer> {

    public FactorialTask(int number) {
        this.number = number;
    }

    int number;

    // standard constructors

    public Integer call() throws InvalidParamaterException {
        if(number < 0) {
            throw new InvalidParamaterException("Number should be positive");
        }
        int fact = 1;
        // ...
        for(int count = number; count > 1; count--) {
            fact = fact * count;
        }
        return fact;
    }
}