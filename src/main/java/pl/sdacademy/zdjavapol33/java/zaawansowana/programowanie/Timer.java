package pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie;


import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 02.06.2020
 *
 *
 * https://www.baeldung.com/java-volatile
 **/
public class Timer {

    private final String name;
    long time;
    LocalDateTime start;
    private LocalDateTime stop;

    public Timer(String name){
        this.name = name;
        start();
    }

    public void start() {
        start = LocalDateTime.now();
    }

    public void stop() {
        stop = LocalDateTime.now();
    }

    public void print(){
        System.out.println(name+ " | "+Duration.between(start, stop).toMillis()+" ms");
    }


}
