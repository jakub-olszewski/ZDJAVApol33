package pl.sdacademy.zdjavapol33.java.zaawansowana.klasy.wewnetrzne;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 12.09.2020
 **/
public class KlasyWewnetrzneMain {

    public static void main(String[] args) {

        Segregator dokumenty = new Segregator("Dokumenty");
        dokumenty.utworzZakladke("Rachunki za prad");
        dokumenty.utworzZakladke("Rachunki za internet");
        dokumenty.wypiszZakladki();

    }
}
