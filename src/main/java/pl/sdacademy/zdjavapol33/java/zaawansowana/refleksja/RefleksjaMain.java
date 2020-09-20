package pl.sdacademy.zdjavapol33.java.zaawansowana.refleksja;

import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.animals.Animal;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.animals.mammals.Lion;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.animals.mammals.Squirrel;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 20.09.2020
 **/
public class RefleksjaMain {

    public static void main(String[] args) {

        // bez refleksji
        System.out.println("bez refleksji");
        System.out.println("-----------------------");
        Lion simba = new Lion("Simba");// tworzenie obiektu klasy Lion
        simba.eat(new Squirrel("Wiewióreczka"));// wykonanie metody eat()
        System.out.println("***\n"+Lion.class.getName()+"***\n"); // wypisanie pełnej nazwy klasy Lion

        // z refleksja

        System.out.println("Z refleksja");
        System.out.println("-----------------------");

        Class klasaLion = null;
        try {
            klasaLion = Class.forName("pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.animals.mammals.Lion");
            // klasaLion = Lion.class; // alternatywa lini wyżej
            System.out.println(klasaLion.getSimpleName());

            // pobieranie konstruktora z klasy
            Constructor konstruktorLion = klasaLion.getConstructor(String.class);
            Lion kingLion = (Lion) konstruktorLion.newInstance("Lion King");// stworzenie nowej instacji Lion

            // pobranie metody
            Method metodaEat = klasaLion.getMethod("eat", Animal.class);

            // wywołanie metody invoke
            metodaEat.invoke(kingLion,new Squirrel("Wiewióreczka"));

            // Lion.class.getConstructor() //alternatywa lini wyżej
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
