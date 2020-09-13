package pl.sdacademy.zdjavapol33.java.zaawansowana.kolekcje.lista;

import pl.sdacademy.zdjavapol33.java.zaawansowana.powtorka.Przedmiot;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 13.09.2020
 **/
public class ListaMain {

    public static void main(String[] args) {
        /**
         * Lista
         */
        McDonald mcDonaldDworzecGlowny = new DworzecGlownychMcDonaldImpl("DworzecGlownych");
        McDonald mcDonaldPlaza = new PlazaMcDonaldImpl("Plaza");

        mcDonaldDworzecGlowny.poproszeFrytki(32);
        mcDonaldPlaza.poproszeMcFlury(12);

        List<Przedmiot> listaPrzedmiotow = new ArrayList<>();
        List<McDonald> listaMcDonald = new LinkedList<>();

        // wypisanie listy przedmiotów
        for(Przedmiot przedmiotZListy: listaPrzedmiotow){
            System.out.println(przedmiotZListy.getNazwa());
        }
    }
}
