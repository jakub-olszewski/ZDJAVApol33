package pl.sdacademy.zdjavapol33.java.zaawansowana.powtorka;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 13.09.2020
 **/
public class Dzwonek {

    private boolean przyciskWcisniety;

    public Dzwonek() {
        this.dzwiek = "aaa kotki dwa...";
        this.przyciskWcisniety = false;
    }

    private String dzwiek;

    public void posluchaj() {
        System.out.println("słucham...");
        if(przyciskWcisniety){
            // dzwoni
            System.out.println(dzwiek);
        }else{
            // nie dzwoni
        }
    }

    public void wcisnij() {
        System.out.println("wcisniecie przycisku");
        przyciskWcisniety = true;
    }
}
