package pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie.runnable;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 22.05.2020
 **/
public class EventLoggingTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Message");
    }
}
