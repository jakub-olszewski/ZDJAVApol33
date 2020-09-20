package pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.animals.mammals;

import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.animals.Animal;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.interfejsy.*;
/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 16.05.2020
 **/
public class Fox extends Mammal implements Predator {

    public Fox(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {

    }
}
