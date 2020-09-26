package pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie.atomic;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 27.05.2020
 **/
public class NotAtomicInt {

    int i;

    public NotAtomicInt(){
        i = 0;
    }

    public void incrementNumber() {
        i = i + 1;
    } // podzielna metoda

}
