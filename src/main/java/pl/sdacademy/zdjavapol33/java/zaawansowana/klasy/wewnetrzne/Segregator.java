package pl.sdacademy.zdjavapol33.java.zaawansowana.klasy.wewnetrzne;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 12.09.2020
 **/
public class Segregator {

    private String tytul;
    private List<Zakladka> zakladki;

    public Segregator(String tytul) {
        this.tytul = tytul;
        zakladki = new ArrayList<>();
    }

    public void utworzZakladke(String tytul) {
        Zakladka nowaZakladka = new Zakladka(tytul);
        zakladki.add(nowaZakladka);
    }

    public void wypiszZakladki() {
        System.out.println("Zakladki:");
        for(Zakladka zakladka: zakladki){
            System.out.println("\t* "+zakladka.tytul);
        }
    }

    public class Zakladka extends ArrayList {

        private String tytul;

        public Zakladka(String tytul) {
            this.tytul = tytul;
        }
    }
}
