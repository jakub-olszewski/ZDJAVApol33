package pl.sdacademy.zdjavapol33.java.zaawansowana.narzedzia;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 23.05.2020
 **/
public class Wypisz {

    public static void tytul(String tytul){
        System.out.println("\n============================");
        System.out.println("\t "+tytul);
        System.out.println("----------------------------");
    }

    public static void poPrzecinku(Object element) {
        System.out.print(element+", ");
    }
}
