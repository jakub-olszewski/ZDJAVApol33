package pl.sdacademy.zdjavapol33.java.zaawansowana.stream;

import pl.sdacademy.zdjavapol33.java.zaawansowana.kolekcje.mapy.Osoba;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
        System.out.println("==============================");
        System.out.println("=== Zadanie 1 ===");
        System.out.println("==============================");

        List<String> listaImion = Arrays.asList("Janek","Adam","Antonina","Ezechiel","Bonifacy");
        listaImion.stream().filter(i -> i.startsWith("A")).forEach(System.out::println);


        /**
         * Zadanie 2.
         * Stwórz klasę Osoba{imie, nazwisko, wiek} następnie listę 5 osób:
         * a) pofiltruj i wypisz osoby pełnoletnie z lambda
         * b) pofiltruj i wypisz osoby pełnoletnie z predykatem
         * c) wypisz listę "imie nazwisko"
         */
        System.out.println("==============================");
        System.out.println("=== Zadanie 2 ===");
        System.out.println("==============================");
        Osoba osoba1 = new Osoba("Jan","Kowalski",51);
        Osoba osoba2 = new Osoba("Anna","Nowak",31);
        Osoba osoba3 = new Osoba("Piotr","Anders",12);
        Osoba osoba4 = new Osoba("Julia","Roszenko",10);
        Osoba osoba5 = new Osoba("Joanna","Dark",66);
        List<Osoba> listaOsob = Arrays.asList(osoba1,osoba2,osoba3,osoba4,osoba5);

        //a)
        listaOsob.stream().filter(o -> o.getWiek()>18).forEach(System.out::println);
        //b)
        listaOsob.stream().filter(maSkonczone18lat()).forEach(System.out::println);
        //c)
        listaOsob.stream().forEach(o-> System.out.println(o.getImie()+" "+o.getNazwisko()));




        /**
         * Zadanie 3.
         * Korzystajac z klasy Osoba i listy osób posortuj listę według wieku i wypisz.
         * Następnie posortuj po nazwisku i wypisz.
         */
        System.out.println("==============================");
        System.out.println("=== Zadanie 3 ===");
        System.out.println("==============================");

        //a)
        listaOsob.stream().sorted((o1,o2)->Integer.compare(o1.getWiek(),o2.getWiek())).forEach(System.out::println);
        System.out.println("\n");
        //b)
        // .sorted(Comparator.reverseOrder()) sortowanie odwrotnie po nazwisku
        // w zdefiniowanej metodzie Osoba.compareTo()
        listaOsob.stream().sorted((o1,o2)->o1.getNazwisko().compareTo(o2.getNazwisko())).forEach(System.out::println);

    }

    private static Comparator<Osoba> sortujWedlugWieku() {
        return (o1, o2) -> Integer.compare(o1.getWiek(), o2.getWiek());
    }

    private static Predicate<Osoba> maSkonczone18lat() {
        return o -> o.getWiek() > 18;
    }

    private static Predicate<String> equalStartM() {
        return e -> e.startsWith("M");
    }
}
