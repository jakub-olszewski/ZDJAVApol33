package pl.sdacademy.zdjavapol33.java.zaawansowana.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 20.09.2020
 **/
public class StreamMain {

    public static void main(String[] args) {

        List<String> listaZakupow = new ArrayList<>();
        listaZakupow.add("Mleko");
        listaZakupow.add("Woda gazowana");

        listaZakupow.
                stream().
                forEach(e -> System.out.println(e));

        System.out.println("==============================");
        // filter
        listaZakupow.stream().filter(e->e.startsWith("M")).forEach(e-> System.out.println(e));

        listaZakupow.stream().filter(equalStartM()).forEach(System.out::println);


        /**
         * Zadanie 1.
         * Stwórz listę imion minimum 5 w tym 2 na literę A:
         * a) pofiltruj i wypisz zaczynajace się na A
         * b) pofiltruj i wypisz zaczynajace się na A oraz majace więcej niż 5 liter
         *
         */

        /**
         * Zadanie 2.
         * Stwórz klasę Osoba{imie, nazwisko, wiek} następnie listę 5 osób:
         * a) pofiltruj i wypisz osoby pełnoletnie z lambda
         * b) pofiltruj i wypisz osoby pełnoletnie z predykatem
         * c) wypisz listę "imie nazwisko"
         */

        /**
         * Zadanie 3.
         * Korzystajac z klasy Osoba i listy osób posortuj listę według wieku i wypisz.
         * Następnie posortuj po nazwisku i wypisz.
         */




    }

    private static Predicate<String> equalStartM() {
        return e -> e.startsWith("M");
    }
}
