package pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.animals.birds;

import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.animals.Animal;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.interfejsy.Predator;
/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 16.05.2020
 **/
public class Eagle extends Bird implements Predator {

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {
        System.out.printf("\n'%s' została zjedzona przez '%s'",animal.getName(),getName());
    }
}
