package pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie.synchronize;

import java.util.concurrent.Callable;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 27.05.2020
 **/
public class CounterImpl implements Counter, Callable {
    private int number;

    public CounterImpl() {
        this.value = 0;
    }

    private int value;

    public CounterImpl(int number,int value) {
        this.number=number;
        this.value = value;
        System.out.println("Counter "+number+" | create()");
    }

    public void increment() {
        System.out.println("Counter "+number+" | increment()");
        value += 1;
    }

    public int getValue() {
        System.out.println("Counter "+number+" | getValue = "+value);
        return value;
    }

    @Override
    public Object call() throws Exception {

        for(int i = 0 ; i < number ; i++ )
        {
            increment();
        }
        return getValue();
    }
}

