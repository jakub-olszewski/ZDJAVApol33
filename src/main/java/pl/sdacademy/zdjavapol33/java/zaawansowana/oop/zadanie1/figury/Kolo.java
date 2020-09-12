package pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie1.figury;

import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie1.Figura;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 12.09.2020
 **/
public class Kolo extends Figura {
    private int promien;

    public Kolo(int promien) {
        this.promien = promien;
    }

    @Override
    public float obliczPole() {
        return (float) Math.PI*promien*promien;
    }

    @Override
    public float obliczObwod() {
        return 0;
    }
}
