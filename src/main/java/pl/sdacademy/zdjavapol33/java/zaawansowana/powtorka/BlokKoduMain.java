package pl.sdacademy.zdjavapol33.java.zaawansowana.powtorka;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 20.09.2020
 **/
public class BlokKoduMain {



    public static void main(String[] args) {

        /**
         * Blok kodu! Zaczyna się { a kończy }
         *
         */
        String tekst = "test";
        if(tekst=="test"){
            System.out.println("Zawsze prawda!");
        }

        { // zmienne w pliku 'żyja' w bloku kodu
            int a = 5, b = 3;
            int c = a + b;
            System.out.println(c);
        }
        // w tym miejscu a, b, c nie istnieje
        {
            int a = 2, b = 1;
            int c = a + b;
            System.out.println(c);
        }

    }
}
