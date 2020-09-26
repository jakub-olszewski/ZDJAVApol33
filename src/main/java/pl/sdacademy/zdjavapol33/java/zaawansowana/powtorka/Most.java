package pl.sdacademy.zdjavapol33.java.zaawansowana.powtorka;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 13.09.2020
 **/
public class Most {

    @Override
    public String toString() {
        return "Most{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;
    private float dlugosc;

    /**
     * Konstruktor bez argumentowy
     */
    public Most(){
        // this odnosi się do tej klasy
        // this() odnosi się do danego konstruktora
        this("Bez nazwy",123f);
    }

    public Most(String name){
        this.name = name;
        wypisz();
        /**
         *
         *
         *
         */
    }

    public Most(String name, float dlugosc){
        this(name);
        this.dlugosc = dlugosc;
    }

    public void wypisz(){
        System.out.println(name);
    }


}
