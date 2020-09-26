package pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie.executors;

import java.util.concurrent.*;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 23.05.2020
 *
 * https://www.baeldung.com/java-executor-service-tutorial
 *
 **/
public class Main {
    public static void main(String[] args) {
        // jeden wątek
        ExecutorService executors = Executors.newSingleThreadExecutor();
        Runnable runnableTask = () -> {
            System.out.println("task...");
        };
        executors.execute(runnableTask);

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);

        Runnable myTask = () -> {
            System.out.println("myTask...");
        };

        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(myTask, 10, TimeUnit.SECONDS);
        try {
            schedule.get(); // result after 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Shutdown");
        scheduledExecutorService.shutdown();

        // okreslona ilość
        int numberOfThreads = 3;
        Executors.newFixedThreadPool(numberOfThreads);

        // nieokreslona ilosc
        Executors.newCachedThreadPool();
    }
}
