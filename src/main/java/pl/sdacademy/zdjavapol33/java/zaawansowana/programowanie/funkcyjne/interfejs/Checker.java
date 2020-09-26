package pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie.funkcyjne.interfejs;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 19.09.2020
 **/
@FunctionalInterface
public interface Checker<T> {
    boolean check(T object);
}








