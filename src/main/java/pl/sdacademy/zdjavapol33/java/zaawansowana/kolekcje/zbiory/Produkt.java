package pl.sdacademy.zdjavapol33.java.zaawansowana.kolekcje.zbiory;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 13.09.2020
 **/
public class Produkt {

    long kodKreskowy;
    String nazwa;

    @Override
    public String toString() {
        return "Produkt{" +
                "kodKreskowy=" + kodKreskowy +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }

    public Produkt(long kodKreskowy, String nazwa) {
        this.kodKreskowy = kodKreskowy;
        this.nazwa = nazwa;
    }
}
