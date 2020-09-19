package pl.sdacademy.zdjavapol33.java.zaawansowana.typygeneryczne;

import pl.sdacademy.zdjavapol33.java.zaawansowana.powtorka.Przedmiot;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 19.09.2020
 **/
public class GeneryczneMain {

    public static void main(String[] args) {

        // stworzenie kubeczka na ołówek
        // konstruktor domyslny tworzy pusty kubek
        Kubeczek<Olowek> kubeczek = new Kubeczek<>();
        System.out.println(kubeczek.czyPusty());

        Olowek olowek = new Olowek("Ołówek Bic");
        Kubeczek<Olowek> kubeczekZOlowkiem = new Kubeczek<>(olowek);
        System.out.println(kubeczekZOlowkiem.name);

        Map<String, Przedmiot> mapaPrzedmiotow = new HashMap<>();

    }
}
