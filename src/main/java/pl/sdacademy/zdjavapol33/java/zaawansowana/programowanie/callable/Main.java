package pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie.callable;

import java.util.concurrent.*;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 22.05.2020
 **/
public class Main {

    public static void main(String[] args) {
        FactorialTask task = new FactorialTask(5);// zadanie liczace silnie / Callable
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        // egzekutor - wykonawcy zadań
        // Single - z jednym zadaniem w danym czasie
        Future<Integer> future = executorService.submit(task);// uruchomienie zadania
        int result = 0;
        try {
            result = future.get().intValue();// pobranie rezultatu silni
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
