package pl.sdacademy.zdjavapol33.java.zaawansowana.optional;

import pl.sdacademy.zdjavapol33.java.zaawansowana.adnotacje.JavaTopic;
import pl.sdacademy.zdjavapol33.java.zaawansowana.adnotacje.MainClass;

import java.util.Optional;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 20.09.2020
 **/
@JavaTopic(topic = "Programowanie funkcyjne", descripion = "Optional")
public class OptionalMain extends MainClass {

    public OptionalMain() {
        super();
    }

    public static void main(String[] args) {
        new OptionalMain();

        Rower rower = new Rower("Romet Bike");
        Rower rowerPusty = null;


        // ofNullable zrzuca wyjatek gdy argument jest null
        Optional<Rower> optionalRower = Optional.ofNullable(rower);

        System.out.println("optional rower isPresent() : " + optionalRower.isPresent());

        if (optionalRower.isPresent()) {// zamiast != null
            System.out.println("Jest rower!");
        }

        sprawdzRower(rower);
        sprawdzRowerBezOptional(rower);
    }

    public static void sprawdzRower(Rower rower) {

        Optional<Rower> option = Optional.of(rower);
        if (option.isPresent()) {
            System.out.println("jest na stanie");
        } else {
            System.out.println("brak");
        }
    }

    public static void sprawdzRowerBezOptional(Rower rower) {

        if (rower != null) {
            System.out.println("Rower jest na stanie");
        } else {
            System.err.println("Brak roweru na stanie!");
        }
    }
}

