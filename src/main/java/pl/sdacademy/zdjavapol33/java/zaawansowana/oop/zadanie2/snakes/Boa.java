package pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.snakes;

import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.animals.Animal;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.animals.mammals.Elephant;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.interfejsy.*;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.plants.Plant;
/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 23.05.2020
 **/
public class Boa extends Snake {

    public Boa(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {
        // kod opisujacy wykonanie metody przez Deer
    }

    // metoda duszenia strangle(Animal animal)
    // nie może udusić słonia!
    public void strangle(Animal animal){
        if(animal instanceof Elephant){// instanceof - jest instancją(typem) Elephant(słonia)
            System.out.printf("\n\"%s\" nie da rady udusić \"%s\"",this.getName(),animal.getName());
        }else{
            System.out.printf("\n\"%s\" dusi \"%s\"",this.getName(),animal.getName());
        }
    }
}