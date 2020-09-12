package pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie1;

/**
 * Klasa abstrakcyjna - posiada metody abstrakcyjne, czyli bez implementacji
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 12.09.2020
 **/
public abstract class Figura implements Obliczenia{

    private String nazwa;
    private float pole;
    private float obwod;

    public abstract float obliczPole();

    public abstract float obliczObwod();
}
