package pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie.synchronize;

import java.util.concurrent.Callable;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 27.05.2020
 **/
public class CounterSyncImpl implements Counter , Callable {

    public CounterSyncImpl(int number, int value) {
        this.number = number;
        this.value = value;
        System.out.println("Counter "+number+" | create()");
    }

    private int number;


    public CounterSyncImpl() {
        this.value = 0;
    }

    private int value;

    public void increment() {
        synchronized (this) {
            System.out.println("Counter "+number+" | increment()");
            value += 1;
        }
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

