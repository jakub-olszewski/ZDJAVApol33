package pl.sdacademy.zdjavapol33.java.zaawansowana.powtorka;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 13.09.2020
 **/
public class ToStringMain {

    public static void main(String[] args) {

        Krasnal krasnalOdSniezki = new Krasnal("Liliputek");
        System.out.println(krasnalOdSniezki.toString());
        System.out.println(krasnalOdSniezki);// i tak wykona sie metoda toString()
        System.out.println(krasnalOdSniezki.getImie());

    }


}
