package pl.sdacademy.zdjavapol33.java.zaawansowana.typygeneryczne;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 19.09.2020
 *
 * Litera T oznacza dowolny Typ obiektu
 **/
public class Kubeczek<E> {

    String name;

    public E getElement() {
        return element;
    }

    private E element;// zawartość kubka

    public Kubeczek(String name,E element) {
        this.name = name;
        this.element = element;
    }

    public Kubeczek(E element) {
        this();// tylko przypisujemy nazwe
             // poniższe wykonuje sie w this()
             //   this.name = "Brak nazwy";
             //   this.element = null;
        this.element = element;// przypisujemy element
    }

    /**
     * Konstruktor pustego kubeczka
     */
    public Kubeczek() {
        this("Brak nazwy",null);
    }

    public boolean czyPusty(){
        return element==null;
    }
}
