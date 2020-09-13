package pl.sdacademy.zdjavapol33.java.zaawansowana.kolekcje.zbiory;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 13.09.2020
 **/
public class ZbioryMain {

    public static void main(String[] args) {
        // zbiór produktów

        Set<Produkt> zbiorProduktow = new HashSet<>();

        Produkt wodaGazowana = new Produkt(1232141L,"Muszynianka");
        Produkt cocaCola = new Produkt(448218341L,"Coca Cola");

        zbiorProduktow.add(wodaGazowana);
        zbiorProduktow.add(cocaCola);

        System.out.println("=======================");
        System.out.println("for ");
        for(Produkt produktZeZbioru : zbiorProduktow){
            System.out.println(produktZeZbioru);
        }

        // konduktor jest takim iteratorem w pociagu

        Iterator<Produkt> iteratorProduktow = zbiorProduktow.iterator();
        System.out.println("=======================");
        System.out.println("while ");
        while (iteratorProduktow.hasNext()){
            Produkt kolejnyProdukt = iteratorProduktow.next();
            System.out.println(kolejnyProdukt);
        }
    }
}
