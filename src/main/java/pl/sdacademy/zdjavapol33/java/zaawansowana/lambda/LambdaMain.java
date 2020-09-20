package pl.sdacademy.zdjavapol33.java.zaawansowana.lambda;

import pl.sdacademy.zdjavapol33.java.zaawansowana.adnotacje.JavaTopic;
import pl.sdacademy.zdjavapol33.java.zaawansowana.adnotacje.MainClass;

import java.util.function.Predicate;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 20.09.2020
 **/
@JavaTopic(topic = "Lambda", descripion = "")
public class LambdaMain extends MainClass {

    public LambdaMain(){
        super();
    }
    public static void main(String[] args) {
            new LambdaMain();

        System.out.println("wersja bez lambda");
        System.out.println("=========================");
        // interfejst z anonimowa implementacja
        LiczbaPi liczbaPi = new LiczbaPi() {
            @Override
            public float get() {
                return 3.141592f;
            }
        };
        System.out.println(liczbaPi.get());

        System.out.println("wersja z lambda");
        System.out.println("=========================");
        // skrócony zapis powyższego z użyciem lambda
        LiczbaPi liczbaPiLambda = () -> 3.141592f;
        System.out.println(liczbaPiLambda.get());

        // brak argumentu wymusza ()
        LiczbaPi liczbaPiLambda2 = () -> {
            return 3.141592f;
        };












//        Predicate<Boolean> pytanie = (a)-> a.equals(true);
//        pytanie.test(5+5==10);
    }
}
