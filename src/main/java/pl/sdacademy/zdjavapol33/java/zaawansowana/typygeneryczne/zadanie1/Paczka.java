package pl.sdacademy.zdjavapol33.java.zaawansowana.typygeneryczne.zadanie1;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 19.09.2020
 **/
public class Paczka<Z extends Zawartosc> {

    public Paczka(String etykieta, Z zawartosc) {
        this.etykieta = etykieta;// this to odwołanie się do obecnej klasy i jego pola czyli etykiety
        this.zawartosc = zawartosc;
    }

    int dlugosc;
    int szerokosc;
    int wysokosc;
    int waga;

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public String getEtykieta() {
        return etykieta;
    }

    public Z getZawartosc() {
        return zawartosc;
    }

    private String etykieta;
    private Z zawartosc;

}
