package pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie.runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 22.05.2020
 **/
public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();// powolanie egzekutora jednowątkowego
        Future future = executorService.submit(new EventLoggingTask());// wykonanie zadania runnable
        executorService.shutdown();// zakonczenie pracy egzekutora

        // poniżej z użyciem lambda
//        ExecutorService egzekutor = Executors.newSingleThreadExecutor();
//        egzekutor.submit(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println();
//            }
//        });
//        egzekutor.submit(()->{
//            System.out.println("run");
//        });
    }
}
