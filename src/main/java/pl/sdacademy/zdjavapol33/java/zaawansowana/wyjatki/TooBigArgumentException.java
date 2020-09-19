package pl.sdacademy.zdjavapol33.java.zaawansowana.wyjatki;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 19.09.2020
 **/
public class TooBigArgumentException extends Exception{

    public TooBigArgumentException(){
        super("Zbyt duża wartość argumentu!");
    }
}
