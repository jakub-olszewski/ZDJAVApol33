package pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie.atomic;

import pl.sdacademy.zdjavapol33.java.zaawansowana.narzedzia.Wypisz;

import java.util.ArrayList;
import java.util.Collection;
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

        /**
         * NotAtomicInt nie jest atomowy co znaczy ze wątki wykonuja operacje w roznej kolejosci
         * i nie czekaja na pozostale. Jest wiele opreracji pobranie zwiekszenie przypisanie i wyswietlenie
         * watki robia to w roznej kolejnosci nie czekajac wiec odstajemy wyniki nie pokolei
         */
        {
            Wypisz.tytul("NotAtomicInt - wątki nie czekaja operacja podzielna");

            // okreslona ilość
            int numberOfThreads = 10;
            ExecutorService executors = Executors.newFixedThreadPool(numberOfThreads);

            NotAtomicInt notAtomicInt = new NotAtomicInt();

            Callable<String> callableTask = () -> {
                notAtomicInt.incrementNumber();
                System.out.println("i=" + notAtomicInt.i);
                return "i=" + notAtomicInt.i;
            };

            List<Callable<String>> callableTasks = new ArrayList<>();
            for (int i = 0; i < numberOfThreads; i++) {
                callableTasks.add(callableTask);
            }

            try {
                executors.invokeAll(callableTasks);//submit(runnableTask);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                executors.shutdown();
            }
        }
        {
            Wypisz.tytul("AtomicInt - wątki  czekaja operacja nie podzielna atomowa");
            // okreslona ilość
            int numberOfThreads = 10;
            ExecutorService executors = Executors.newFixedThreadPool(numberOfThreads);

            AtomicInt atomicInt = new AtomicInt();

            Callable<String> callableTask = () -> {
                atomicInt.incrementNumber();
                System.out.println("i=" + atomicInt.i.get());
                return "i=" + atomicInt.i;
            };

            List<Callable<String>> callableTasks = new ArrayList<>();
            for (int i = 0; i < numberOfThreads; i++) {
                callableTasks.add(callableTask);
            }

            try {
                executors.invokeAll(callableTasks);//submit(runnableTask);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                executors.shutdown();
            }
        }


    }
}
