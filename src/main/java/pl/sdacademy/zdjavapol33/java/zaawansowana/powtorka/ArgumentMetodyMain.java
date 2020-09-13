package pl.sdacademy.zdjavapol33.java.zaawansowana.powtorka;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 13.09.2020
 **/
public class ArgumentMetodyMain {

    public static void main(String[] args) {

        Lodowka lodowkaWMieszkaniu = new Lodowka("Samsung");
        Przedmiot ciasto = new Przedmiot("Ciasto marchewkowe z budyniem");
        lodowkaWMieszkaniu.wloz(ciasto);
    }
}
