package pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie.volatiles;

import pl.sdacademy.zdjavapol33.java.zaawansowana.narzedzia.Wypisz;
import pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie.Timer;


/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 02.06.2020
 *
 * Exampe: https://dzone.com/articles/java-volatile-keyword-0
 **/
public class Main {

    public static void main(String[] args) {

        {
            /**
             * Oczekujemy, że ten program po prostu wydrukuje 42 po krótkim opóźnieniu.
             * Jednak w rzeczywistości opóźnienie może być znacznie dłuższe.
             * Może nawet zawiesić się na zawsze, a nawet wydrukować zero!
             *
             * Przyczyną tych anomalii jest brak odpowiedniej widoczności pamięci i zmiany kolejności .
             *
             * Zmiana kolejności jest techniką optymalizacji w celu poprawy wydajności.
             * Co ciekawe, różne elementy mogą zastosować tę optymalizację:
             *
             * - Procesor może opróżnić bufor zapisu w dowolnej kolejności innej niż kolejność programu
             * - Procesor może zastosować technikę wykonywania poza kolejnością
             */
            /**
             * Za pomocą metody yield() wątek może chwilowo oddać sterowanie,
             * by umożliwić wykonanie innych wątków, a metoda sleep() wstrzymuje wątek na określony czas.
             */

            Wypisz.tytul("Przyklad 1");
            Timer timer = new Timer("main without volatile");
            timer.start();
            new TaskRunner.Reader().start();
            TaskRunner.number = 42;
            TaskRunner.ready = true;
            timer.stop();
            timer.print();
        }
        {
            /**
             * Aby zapewnić, że aktualizacje zmiennych będą się rozprzestrzeniać
             * w przewidywalny sposób na inne wątki, powinniśmy zastosować
             * modyfikator volatile do tych zmiennych.
             */
            Wypisz.tytul("Przyklad 2");
            Timer timer = new Timer("main with volatile");
            timer.start();
            new TaskVolatileRunner.Reader().start();
            TaskVolatileRunner.number = 42;
            TaskVolatileRunner.ready = true;
            timer.stop();
            timer.print();
        }
    }

}
