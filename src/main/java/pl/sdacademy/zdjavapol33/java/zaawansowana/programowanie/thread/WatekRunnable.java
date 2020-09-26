package pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie.thread;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 22.05.2020
 **/
public class WatekRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Wątek Runnable");
    }
}
