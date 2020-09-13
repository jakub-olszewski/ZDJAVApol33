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

    /**
     * Konstruktor bez argumentowy
     */
    public Most(){
        // this odnosi się do tej klasy
        // this() odnosi się do danego konstruktora
        this("Bez nazwy");
    }

    public Most(String name){
        this.name = name;
        wypisz();
    }

    public void wypisz(){
        System.out.println(name);
    }


}
