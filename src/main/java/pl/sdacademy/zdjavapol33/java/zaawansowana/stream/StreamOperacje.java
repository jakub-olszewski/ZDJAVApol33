package pl.sdacademy.zdjavapol33.java.zaawansowana.stream;


import pl.sdacademy.zdjavapol33.java.zaawansowana.kolekcje.mapy.Osoba;
import pl.sdacademy.zdjavapol33.java.zaawansowana.narzedzia.Wypisz;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 26.09.2020
 **/
public class StreamOperacje {

    public static void main(String[] args) {

        /**
         * Operacje pośrednie
         */
        Wypisz.tytul("OPERACJE POSREDNIE");

        /**
         * map - przekonwertować elementy strumienia na nowe, mozemy zmienić typ
         */
        Wypisz.tytul("map");
        List.of(1,2,3).stream().map(e -> e*3.0).forEach(System.out::println);
        List.of(1,2,3).stream().map(e -> String.valueOf(e)); // liczby konwertujemy na String

        /**
         * flatMap - połaczenie wielu streamów w jeden nowy stream
         */
        Wypisz.tytul("flatMap");
        List<String> list = Arrays.asList("5.6","7.4","4","1","3.2");

        list.stream().flatMap(num -> Stream.of(num)).forEach(System.out::println);


        Statistics statisticsA = new Statistics(2.0,List.of(1,2,3));
        Statistics statisticsB = new Statistics(2.5,List.of(2,3,2,3));

        System.out.println("==========================");

        Stream.of(statisticsA,statisticsB).
                flatMap(statistics -> statistics.getValues().stream()).
                forEach(System.out::println);

        /**
         * filter - filtrowanie
         */
        Wypisz.tytul("filter");
        int[] idx = {0};
        Stream.generate(() -> idx[0]++).
                limit(10). // limit 10 pozycji
                filter(e -> e % 2 == 0). // filtrowanie parzystych
                forEach(Wypisz::poPrzecinku); // wypisanie z użyciem Wypisz poPrzecinku

        System.out.println();

        /**
         * sorted - sortowanie
         */
        Wypisz.tytul("sorted");
        Arrays.asList(6,3,6,21,20,1).
                stream().
                sorted(Comparator.reverseOrder()). // sortowanie w odwrotnej kolejności
                forEach(Wypisz::poPrzecinku);
        ;

        /**
         * distinct - zapewnienie unikalności
         */
        Wypisz.tytul("distinct");
        Arrays.asList(3,6,6,20,21,21).stream().
                distinct().// zapewnienie unikalności
                forEach(Wypisz::poPrzecinku);

        Osoba jan = new Osoba("Jan","Kowalski");
        Osoba anna = new Osoba("Anna","Nowak");

        Wypisz.tytul("");
        Arrays.asList(jan,jan,anna,anna).stream().
                distinct().// zapewnienie unikalności
                forEach(Wypisz::poPrzecinku);

        /**
         * Operacje kończace
         */
        Wypisz.tytul("OPERACJE KONCZACE");

        /**
         * forEach
         */
        Wypisz.tytul("forEach");
        List.of(1,2,3,4,5,6,7,8,9).
                forEach(Wypisz::poPrzecinku);

        /**
         * collect - konwertowanie do danej struktury
         */
        Wypisz.tytul("collect");

        List<Integer> listaStworzonaPrzezCollect = Stream.
                generate(()-> new Random().nextInt()).// generowanie losowe liczb
                limit(100).// ograniczenie do 10
                distinct().// unikalność
                filter(e -> Math.abs(e)<1000000000).// filtoranie |e|<1000
                collect(Collectors.toUnmodifiableList());// konwertowanie do struktury listy

        // Collectors -> toMap toList toSet
        listaStworzonaPrzezCollect.stream().forEach(Wypisz::poPrzecinku);


        String listaNazwisk = Stream.of(anna,jan).// stream obiektów Osoba
                map(osoba -> osoba.getNazwisko()).// map -> Stream nazwisk
                collect(Collectors.joining(", "));// konwertowanie ze złaczeniem po przecinku do String

        // poniżej to samo ale na liście osób

        List<Osoba> listaOsob = Arrays.asList(jan,anna);
        listaOsob.stream().
                map(osoba -> osoba.getNazwisko()).// map -> Stream nazwisk
                collect(Collectors.joining(", "));// konwertowanie ze złaczeniem po przecinku do String


        Wypisz.tytul(listaNazwisk);

        /**
         * groupingBy - tworzy Map
         */
        Wypisz.tytul("groupingBy");

        Stream.of("This","is","SDA","the","best","academy","in","the","universe").
                collect(Collectors.groupingBy(String::length)).
                forEach((key,value) -> System.out.println(key + " "+value));

        /**
         * findFirst
         */
        Wypisz.tytul("findFirst");


        Optional<String> element = List.of("Anna", "Jan", "Bonifacy", "Edward", "Klemens").stream().
                sorted().
                filter(i -> i.length() < 7).
                filter(i -> i.startsWith("A") || i.startsWith("J")).
                findFirst();// zwraca 1 element spelniajacy warunki wyzej

        if(element.isPresent()){
            System.out.println(element.get());
        }

        /**
         * findAny - znajdz jaki kolwiek, nie koniecznie pierwszy
         */
        Wypisz.tytul("findAny");
        Optional<Integer> wynik = List.of(7, 21, 13, 4, 8).stream().
                filter(e -> e % 2 == 0).
                findAny();

        if(wynik.isPresent()){
            System.out.println(wynik.get());
        }

    }
}
