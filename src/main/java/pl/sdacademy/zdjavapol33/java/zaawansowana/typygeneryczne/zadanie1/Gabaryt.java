package pl.sdacademy.zdjavapol33.java.zaawansowana.typygeneryczne.zadanie1;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 19.09.2020, So
 **/
public enum Gabaryt {
    A(64,38,8),B(64,38,19),C(64,38,41);

    //   pola : dlugosc , szerokosc, wysokosc,
    private int dlugosc, szerokosc, wysokosc;
    //  konstruktor

    Gabaryt(int dlugosc, int szerokosc, int wysokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    //  geters
    public int getDlugosc() {
        return dlugosc;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public int getWysokosc() {
        return wysokosc;
    }
}
