package pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie1;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 12.09.2020
 **/
public class Trapez extends Figura {
    private int podstawa1;
    private int podstawa2;
    private int ramie1;
    private int ramie2;
    private int wysokosc;

    public Trapez(int podstawa1, int podstawa2, int ramie1, int ramie2, int wysokosc) {
        this.podstawa1 = podstawa1;
        this.podstawa2 = podstawa2;
        this.ramie1 = ramie1;
        this.ramie2 = ramie2;
        this.wysokosc = wysokosc;
    }

    @Override
    public float obliczPole() {
        return (podstawa1+podstawa2)*wysokosc/2;
    }

    @Override
    public float obliczObwod() {
        return 0;
    }
}
