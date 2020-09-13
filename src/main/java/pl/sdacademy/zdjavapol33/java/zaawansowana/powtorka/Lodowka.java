package pl.sdacademy.zdjavapol33.java.zaawansowana.powtorka;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 13.09.2020
 **/
public class Lodowka {
    public Lodowka(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
    }

    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    String nazwaFirmy;

    public void wloz(Przedmiot przedmiot){

        // toLowerCase() - zmniejszenie liter na male

        System.out.println("Do "+ this.getClass().getSimpleName().toLowerCase()+
                " firmy "+this.nazwaFirmy+
                " wkladam "+przedmiot.getNazwa().toLowerCase());
    }
}
