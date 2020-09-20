package pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.animals.Animal;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.animals.birds.Eagle;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.animals.mammals.Deer;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.animals.mammals.Elephant;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.animals.mammals.Lion;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.animals.mammals.Squirrel;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.interfejsy.*;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.plants.Grass;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.plants.Plant;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.snakes.Boa;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 12.09.2020
 **/
public class Zadanie2Main {

    public static void main(String[] args) {

        /**
         * Zadanie: Utworz odpowiednie zwierzaki
         *
         * Classes:
         * Deer, - Mammal, Vegenarian
         * Squirrel, - Mammal, Vegenarian, Prey
         * Elephant, - Mammal, Vegenarian
         * Fox, - Mammal, Predator
         * Whale, - Mammal, Predator
         * Snake, - Animal, Predator
         * Eagle, - Bird, Predator
         * Stork, - Bird, Predator
         * Lion, - Mammal, Predator
         * Sunflower, - Plant
         * Grass, - Plant
         *
         * Interfaces:
         * Vegenarian, - methods: eat(Plant plant)
         * Predator, - methods: eat(Animal animal)
         * Prey, - methods: runAwayFrom(Animal animal)
         *
         * Extends classes:
         * Bird, - Animal
         * Animal,
         * Mammal, - Animal
         * Plant
         */

        /**
         * Ważne!!!
         * - Interfejsy nie posiadają ciał metod !
         * - W klasach implementujemy metody z interfejsów
         *
         */

        /**
         * Zadanie1: Stwórz wiewiórkę nazwij ją Pinky
         * Utwórz konstrukor ustawiający pole name;
         *
         * Uwaga. Konstruktor powinien być utworzony w klasie Animal
         * i będzie dostępny we wszystkich klasa które rozszerzają
         * klase Animal
         *
         * Dostajemy infomacje informacje o narodzinach
         */
        Squirrel pinky = new Squirrel("Pinky");

        /**
         * Zadanie2: Utworz obiekt Eagle. Wykonaj metodę eat()
         * argumentem będzie wiewiórka z Zadania1.
         * Implementacja będzie wyglądać następująco
         * na konsolę program wypisze:
         *
         * 'imieWiewiorki' została zjedzona przez 'imieOrła'
         */
        Eagle baldEagle = new Eagle("Bald Eagle");
        baldEagle.eat(pinky);

        /**
         * Zadanie3:Utworz obiekt Lion i Elephant.
         * Elephant ucieka.
         * Lion chce to zjeść.
         */
        Lion kingLion = new Lion("King Lion");
        Elephant dumboElephant = new Elephant("Dumbo");
        dumboElephant.runAwayFrom(kingLion);
        kingLion.eat(dumboElephant);


        /**
         * Zadanie4:Utworz jelonek 'Bambi'.
         * jelonek je trawe. Wystraszył się i ucieka.
         * Lew uciekł z ZOO i chce zjeść jelonka.
         *
         */
        Deer bambiDeer = new Deer ("Bambi");
        Grass grass = new Grass("Trawa");
        bambiDeer.eat(grass);

        bambiDeer.runAwayFrom(kingLion);
        kingLion.eat(bambiDeer);

        /**
         * Zadanie5: Boa 'Kaa' próbuje udusić jelonka. Udaje mu się. :(
         * Potem próbuje udusić słonia i ma problem.
         *
         */
        Boa kaaBoa = new Boa("Kaa");
        kaaBoa.strangle(bambiDeer);
        kaaBoa.strangle(dumboElephant);

    }
}
