package pl.sdacademy.zdjavapol33.java.zaawansowana.typygeneryczne.zadanie1;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 19.09.2020
 **/
public class WeightOverloadException extends Exception {

    // wyjatek podobnie jak TooBigArgumentException
    // w informacji paczka wieksza od 25
    WeightOverloadException(){
        super("Waga jest większa niż 25 kg, paczka nie moze zostać nadana!");
    }
}
