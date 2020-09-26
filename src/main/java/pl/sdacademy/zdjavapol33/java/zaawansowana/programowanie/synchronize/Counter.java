package pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie.synchronize;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 27.05.2020
 **/
public interface Counter {

    /**
     * Pobranie wartości licznika
     * @return licznik
     */
    public int getValue();

    /**
     * Zwiększenie stanu licznika
     */
    public void increment();

}
