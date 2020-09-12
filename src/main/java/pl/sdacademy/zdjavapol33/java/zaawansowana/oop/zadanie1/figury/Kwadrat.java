package pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie1.figury;

import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie1.Figura;

/**
 * Kwadrat rozszerza klasę Figura
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 12.09.2020
 **/
public class Kwadrat extends Figura {

    private int bok;

    public Kwadrat(int bok) {
        this.bok = bok;
    }


    @Override
    public float obliczPole() {
        return bok*bok;
    }

    @Override
    public float obliczObwod() {
        return 0;
    }
}
