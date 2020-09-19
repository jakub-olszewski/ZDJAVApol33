package pl.sdacademy.zdjavapol33.java.zaawansowana.wyjatki;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 19.09.2020
 **/
public class Obliczenia {

    private static final int GODZINY_MAX = 1000;

    public static int pobierzLiczbeSekund(int godziny) throws TooBigArgumentException {
        if(godziny<0){
            throw new IllegalArgumentException("Wprowadzono wartość:"+godziny+" Godziny musza byc dodatnie!");
        }else if(godziny>GODZINY_MAX){
            throw new TooBigArgumentException();
        }else{
            return godziny*60*60;
        }
    }
}
