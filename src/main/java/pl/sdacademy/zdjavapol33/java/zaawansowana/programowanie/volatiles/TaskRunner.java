package pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie.volatiles;

import pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie.Timer;
/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 02.06.2020
 **/
public class TaskRunner {

    public static int number;
    public static boolean ready;

    public static class Reader extends Thread {

        @Override
        public void run() {
            Timer timer = new Timer("thread");
            timer.start();
            while (!ready) {
                Thread.yield();
            }

            System.out.println(number);
            timer.stop();
            timer.print();
        }
    }

}
