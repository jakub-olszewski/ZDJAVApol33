package pl.sdacademy.zdjavapol33.java.zaawansowana.powtorka;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 13.09.2020
 **/
public class Przedmiot {

    public Przedmiot(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Przedmiot{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }

    public String getNazwa() {
        return nazwa;
    }

    private String nazwa;
}
