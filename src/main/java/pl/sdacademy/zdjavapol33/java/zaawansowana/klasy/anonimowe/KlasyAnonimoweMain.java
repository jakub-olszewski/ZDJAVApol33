package pl.sdacademy.zdjavapol33.java.zaawansowana.klasy.anonimowe;

import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie1.Figura;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie1.figury.Kwadrat;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie1.interfejsy.Obliczenia;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 12.09.2020
 **/
public class KlasyAnonimoweMain {
    public static void main(String[] args) {

        // obliczeniaTrojkataRownobocznego
        Obliczenia oblTrojRowno = new Obliczenia() {

            @Override
            public float obliczPole() {
                return 10;
            }

            @Override
            public float obliczObwod() {
                return 9;
            }
        };

        // klasa anonimowa trojkatRownoboczny - taka klasa nie istnieje
        Figura trojkatRownoboczny = new Figura() {
            @Override
            public float obliczPole() {
                return 0;
            }

            @Override
            public float obliczObwod() {
                return 0;
            }
        };

        Kwadrat kwadrat = new Kwadrat(5);

        List<Figura> listaFigur = new ArrayList<>();
        listaFigur.add(kwadrat);
        listaFigur.add(trojkatRownoboczny);



    }
}
