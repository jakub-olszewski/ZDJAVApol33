package pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie1;

/**
 * Interfejs, posiada wylacznie opis bez implementacji, czyli działania
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 12.09.2020
 **/
public interface Obliczenia {

    // metoda
    // modyfikator widocznosci - public
    // typ zwracany - float
    // nazwa metody - pole

    /**
     * Metoda do obliczania pole figury
     * @return
     */
    public float obliczPole();


    /**
     * Metoda obliczajaca obwód figury
     * @return
     */
    public float obliczObwod();

}
