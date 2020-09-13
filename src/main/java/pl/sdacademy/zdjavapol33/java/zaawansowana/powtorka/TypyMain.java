package pl.sdacademy.zdjavapol33.java.zaawansowana.powtorka;

import pl.sdacademy.zdjavapol33.java.zaawansowana.oop.zadanie2.animals.mammals.Lion;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 13.09.2020
 **/
public class TypyMain {

    public static void main(String[] args) {

        Lion kingLion = new Lion("King Lew");
        int liczbaA = 5;
        Integer liczbaB = 5;

        Portfel myPortfel = new Portfel();
        Portfel.zawartosc();
        myPortfel.zawartosc();
    }

    public static class Portfel{

        static String zawartosc;

        public Portfel() {
            this.zawartosc = "Nowy portfel";
        }

        public static void zawartosc(){
            if(zawartosc==null)
            {
                System.out.println("Pusty portfel");
            }else {
                System.out.println(zawartosc);
            }
        }
    }
}
