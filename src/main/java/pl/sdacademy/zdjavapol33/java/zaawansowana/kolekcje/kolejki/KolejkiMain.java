package pl.sdacademy.zdjavapol33.java.zaawansowana.kolekcje.kolejki;

import pl.sdacademy.zdjavapol33.java.zaawansowana.kolekcje.zbiory.Produkt;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 19.09.2020
 **/
public class KolejkiMain {

    public static void main(String[] args) {

        Queue<Produkt> kolejkaProduktow = new LinkedList<>();
        Produkt produkt1 = new Produkt(123123123L,"Coca cola");
        Produkt produkt2 = new Produkt(123155123L,"Pepsi");

        kolejkaProduktow.offer(produkt1);// offer - dodaje do kolejki
        kolejkaProduktow.offer(produkt2);

        System.out.println(kolejkaProduktow.peek());// podejrzenie pierwszego elementu
        System.out.println(kolejkaProduktow.poll());// usuniecie pierwszego elementu z kolejki i zwrócenie wartości
        System.out.println(kolejkaProduktow.poll());// ponowne usuniecie pierwszego elementu i zwrócenie wartości

        // jeśli mamy 2 produkty i używamy 2 razy poll kolejka bedzie pusta!
        System.out.println(kolejkaProduktow.isEmpty()); // czy kolejka jest pusta ?

        Produkt produkt3 = new Produkt(234234344L,"Sałata");
        kolejkaProduktow.offer(produkt3);

        // w tym miejscu nie można pobrać elementu ponieważ wszystkie 2 elementy zostały zdjęte z kolejki
        kolejkaProduktow.element(); // zwraca element z "Czoła" kolejki - nie usuwa
    }
}
