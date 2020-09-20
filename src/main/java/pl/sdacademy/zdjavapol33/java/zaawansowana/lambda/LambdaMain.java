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

        System.out.println("Lambda z parametrem");
        // bez lambda
        PytanieParzystosc pytanie1 = new PytanieParzystosc() {
            @Override
            public boolean czyJest(int liczba) {
                return liczba % 2 == 0;
            }
        };

        // z lambda
        PytanieParzystosc pytanie2 = liczba -> (liczba % 2) == 0;
        System.out.println(pytanie2.czyJest(4));

        System.out.println("Bez Lambda z 2 parametrami");

        // implementacja anonimowa
        Liczby liczbyAnonimowe = new Liczby() {
            @Override
            public int dodaj(int a, int b) {
                return a + b;
            }
        };

        // implementacja nieanonimowa
        Liczby liczbyNieAnonimowe = new LiczbyNieAnonimowe();

        Liczby liczbyLambda = (a,b) -> a + b;

        System.out.println(liczbyNieAnonimowe.dodaj(3, 5));
        System.out.println(liczbyAnonimowe.dodaj(9, 5));










//        Predicate<Boolean> pytanie = (a)-> a.equals(true);
//        pytanie.test(5+5==10);
    }
}
