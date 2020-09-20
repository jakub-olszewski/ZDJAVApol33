package pl.sdacademy.zdjavapol33.java.zaawansowana.typygeneryczne.zadanie1;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 19.09.2020
 **/
public class Zadanie1Main {

    /**
     * Typ wyliczeniowy, Dziedziczenie, Typy generyczne
     *
     * Paczkomat
     * - Paczkomat - klasa główna { lokalizacja, nazwa}
     * - WarszawaPaczkomat - dziedziczy po klasie paczkomat
     * - w argumencie podjemy obiekt Paczka<Z>
     *     { dlugosc, szerokosc, wysokosc, waga}
     * - typ wyliczeniowy paczka rozmar A, B ,C
     * gabaryt A – maksymalne wymiary 8 X 38 X 64 cm, maksymalna waga: 25 kg;
     * gabaryt B – maksymalne wymiary 19 X 38 X 64 cm, maksymalna waga: 25 kg;
     * gabaryt C – maksymalne wymiary 41 X 38 X 64 cm, maksymalna waga: 25 kg.
     * - zrzucanie wyjatku w przypadku paczki ciezszej niz 25 kg
     * - zwracanie ceny paczki w zależności od gabarytów
     * gabaryt A – 12,99
     * gabaryt B – 13,99
     * gabaryt C – 15,99
     *
     */

    public static void main(String[] args) {

        // obiekt paczkomat z Warszawy
        Paczkomat paczkomatWarszawa = new Paczkomat("WAW-01","Warszawa ul.Cwiartki 3/4");

        // Dlugopis musi extends Zawartosc
        Dlugopis dlugopis = new Dlugopis();// tworzymy długopis
        Kot kotek = new Kot();
        // new - nowy obiekt
        // <> - typ generyczny
        Paczka<Dlugopis> paczka = new Paczka<Dlugopis>("12323122",dlugopis);
        paczka.setDlugosc(11);// ponizej ustawimy wlasciwosci paczki
        paczka.setSzerokosc(3);
        paczka.setWysokosc(3);
        paczka.setWaga(1);

        //Paczka<Kot> paczkaZKotem;// nie możliwa - bład

        try {// obsługa wyjatku za dużej wagi
            paczkomatWarszawa.nadaj(paczka);
        } catch (Exception e) {
            // TODO wypisz komunikat
            e.printStackTrace();
        }
    }
}
