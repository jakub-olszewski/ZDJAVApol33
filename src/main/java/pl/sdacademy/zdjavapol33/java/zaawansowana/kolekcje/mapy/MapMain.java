package pl.sdacademy.zdjavapol33.java.zaawansowana.kolekcje.mapy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 13.09.2020
 **/
public class MapMain {

    public static void main(String[] args) {

        // mapa pesel -> osoba
        Map<Long,Osoba> mapaNumerPeselOsoba = new HashMap<>();
        Osoba janKowalskiOsoba = new Osoba("Jan","Kowalski");
        mapaNumerPeselOsoba.put(200101012345L,janKowalskiOsoba);
        mapaNumerPeselOsoba.put(200222012346L,new Osoba("Julia","Nowak"));

        // pobieranie osoby po peselu
        Osoba osobePoPeselu = mapaNumerPeselOsoba.get(200101012345L);
        System.out.println(osobePoPeselu);

        // czy w mapie istnieje osoba o pesel 200202012345 ?
        boolean czyIstnieje = mapaNumerPeselOsoba.containsKey(200202012345L);
        System.out.println(czyIstnieje);

        // entry set? zbiór elementów mapy
        Set<Map.Entry<Long, Osoba>> entrySet = mapaNumerPeselOsoba.entrySet();
        for(Map.Entry<Long, Osoba> elementMapy : entrySet){
            // wypisanie elementów mapy
            System.out.println(elementMapy.getKey()+" "+elementMapy.getValue());
        }

        // ilosc elementów mapy
        int iloscElementowMapy = mapaNumerPeselOsoba.size();
        System.out.println("iloscElementowMapy:"+iloscElementowMapy);

        Map<Pesel,Osoba> mapaPeselOsoba = new HashMap<>();
        Pesel peselJanKowalski = new Pesel(200101012345L);
        mapaPeselOsoba.put(peselJanKowalski,janKowalskiOsoba);
        mapaPeselOsoba.put(new Pesel(200222012346L),new Osoba("Julia","Nowak"));



    }
}
