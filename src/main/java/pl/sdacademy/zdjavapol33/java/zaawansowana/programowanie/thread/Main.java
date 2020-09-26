package pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie.thread;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 22.05.2020
 **/
public class Main {

    public static void main(String[] args) {

        // Runnable
        WatekRunnable watekRunnable = new WatekRunnable();
        Thread watek = new Thread(watekRunnable);// klasa Thread wykorzystujaca runnable
        watek.start();// uruchomienie wątku

        // Thread
        WatekThread watekThread = new WatekThread();
        watekThread.start();

    }
}
