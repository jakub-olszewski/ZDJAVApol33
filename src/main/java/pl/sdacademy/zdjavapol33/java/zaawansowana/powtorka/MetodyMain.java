package pl.sdacademy.zdjavapol33.java.zaawansowana.powtorka;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 13.09.2020
 **/
public class MetodyMain {

    public static void main(String[] args) {

        podaj("");

        //podaj(tekst:""); // nie dopisujemy podpowiedzi np. 'tekst:'

        String krolika = "krolik";

        podaj(krolika);

    }

    public static void podaj(String tekst){// typ String wpisujemy w metodzie!
        System.out.println("Prosze to "+tekst);
    }
}
