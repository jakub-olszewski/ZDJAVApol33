package pl.sdacademy.zdjavapol33.java.zaawansowana.adnotacje;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Adnotacja posiada @interface
 *
 * linie zawierajace default sa opcjonalne i maja wartości domyślne
 */
@Retention(RetentionPolicy.RUNTIME)// adnotacja odczytywana podczas uruchomienia RUNTIME
@Target(ElementType.TYPE) // adnotacja dostępna tylko na TYPE czyli klasę
public @interface JavaTopic {

    enum Level {
        LOW,MEDIUM,HIGH;
    }
    // priorytet
    Level priority() default Level.MEDIUM;
    // tagi jako tablica
    String[] tags() default "";
    // tytuł
    String topic();
    // opis
    String descripion();
    // kto utworzył
    String createdBy() default "Jakub Olszewski";
}
