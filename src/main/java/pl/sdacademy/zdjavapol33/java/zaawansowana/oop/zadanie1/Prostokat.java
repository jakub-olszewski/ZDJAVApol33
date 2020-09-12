package pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie1;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 12.09.2020
 **/
public class Prostokat extends Figura {
    private int bokA;
    private int bokB;

    public Prostokat(int bokA, int bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    public float obliczPole() {
        return bokA*bokB;
    }

    @Override
    public float obliczObwod() {
        return 0;
    }
}
