package pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie1;

import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie1.figury.Kolo;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie1.figury.Kwadrat;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie1.figury.Prostokat;
import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie1.figury.Trapez;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 12.09.2020
 **/
public class Main {

    public static void main(String[] args) {
        // Zadanie z figurami

        Kwadrat kwadrat = new Kwadrat(5);
        Kolo kolo = new Kolo(4);
        Prostokat prostokat = new Prostokat(3, 4);
        Trapez trapez = new Trapez(2,4,3,3,4);


        List<Figura> listaFigur = new ArrayList<>();
        listaFigur.add(kolo);
        listaFigur.add(kwadrat);
        listaFigur.add(prostokat);
        listaFigur.add(trapez);

        float suma = 0;
        for(Figura figura : listaFigur){
            // figura.obliczPole(); // nie dziala gdy figura jest Object
            suma +=figura.obliczPole();
        }

        System.out.println("Suma pól figur = "+suma);
    }
}
