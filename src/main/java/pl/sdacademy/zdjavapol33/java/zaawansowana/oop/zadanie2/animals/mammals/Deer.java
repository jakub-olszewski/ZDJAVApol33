package pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.animals.mammals;


import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.animals.Animal;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.interfejsy.*;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.plants.Plant;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 16.05.2020
 **/
public class Deer extends Mammal implements Vegetarian, Prey {

    public Deer(String name) {
        super(name);
    }

    @Override
    public void runAwayFrom(Animal animal) {

    }

    @Override
    public void eat(Plant plant) {
        System.out.printf("\n%s je %s",this.getName(),plant.getName());
        // kod opisujacy wykonanie metody przez Deer
    }
}
