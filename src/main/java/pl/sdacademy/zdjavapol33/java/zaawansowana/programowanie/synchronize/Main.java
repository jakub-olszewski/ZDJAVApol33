package pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie.synchronize;


import pl.sdacademy.zdjavapol33.java.zaawansowana.narzedzia.Wypisz;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 27.05.2020
 **/
public class Main {

    public static void main(String[] args) {
        {
            Wypisz.tytul("Counter synchronized - tylko jeden wątek jednoczesnie korzysta z metody increment()\n\t" +
                    " Każdy wątek czeka na swoją kolej! Dostępu do metody increment()");

            // okreslona ilość
            int numberOfThreads = 10;
            ExecutorService executors = Executors.newFixedThreadPool(numberOfThreads);// egzekutor zawierajacy 10 wątków

            int value = 0;
            List<Callable<String>> callableTasks = new ArrayList<>();// lista zadań dla wątków
            for (int i = 0; i < numberOfThreads; i++) {
                callableTasks.add(new CounterSyncImpl(i,value));
            }

            try {
                executors.invokeAll(callableTasks);// wykonujemy start wszytkich zadań dodanych powyżej
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                executors.shutdown();
            }
        }
        {
            Wypisz.tytul("Counter synchronized - wiele wąteków korzysta z increment() nie czekają na dostęp wykonują się dalej" +
                    "\n\t" +
                    " Widać to jak wywoływana jest metoda getValue()");

            // okreslona ilość
            int numberOfThreads = 10;
            ExecutorService executors = Executors.newFixedThreadPool(numberOfThreads);

            int value = 0;
            List<Callable<String>> callableTasks = new ArrayList<>();
            for (int i = 0; i < numberOfThreads; i++) {
                callableTasks.add(new CounterImpl(i,value));
            }

            try {
                executors.invokeAll(callableTasks);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                executors.shutdown();
            }
        }
    }
}
