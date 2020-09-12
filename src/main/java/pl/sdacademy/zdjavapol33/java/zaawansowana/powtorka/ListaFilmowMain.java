package pl.sdacademy.zdjavapol33.java.zaawansowana.powtorka;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 12.09.2020
 **/
public class ListaFilmowMain {
    public static void main(String[] args) {
        // przyklad lista filmów - napisów (String)
        // domyślnie List -> List<Object>
        List<String> listaFilmow = new ArrayList();
        listaFilmow.add("Tytanik");
        listaFilmow.add("Matriks");

        // wypisanie filmów w pętli
        for(String film : listaFilmow){
            //sout
            System.out.println(film);
        }
    }
}
