package pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 27.05.2020
 **/
public class AtomicInt {

    public AtomicInt(){
        i = new AtomicInteger(0);
    }

    AtomicInteger i;

    public void incrementNumber() {
        i.incrementAndGet();
    }// niepodzielna metoda atomowa
}

