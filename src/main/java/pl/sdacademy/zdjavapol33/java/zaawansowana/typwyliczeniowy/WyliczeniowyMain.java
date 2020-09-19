package pl.sdacademy.zdjavapol33.java.zaawansowana.typwyliczeniowy;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 19.09.2020
 **/
public class WyliczeniowyMain {

    public static enum Odpowiedz{
        TAK,NIE,NIE_WIEM;
    }

    public static void main(String[] args) {
        String tak = "tak";
        String nie = "nie";
        String nieWiem = "nie weim";

        // enum - posiadamy listę wyboru ...
        Odpowiedz odpowiedz = Odpowiedz.TAK; // deklaracja zmiennej wyliczeniowej
        switch (odpowiedz){

            case TAK:
                System.out.println("Miło, że się zgadzasz");
                break;
            case NIE:
                System.out.println("Szkoda, że się nie zgadzasz");
                break;

        }

        String odpowiedzNapis = "Tak";
        switch (odpowiedzNapis){
            case "tak":
                System.out.println("Miło, że się zgadzasz");
                break;
            case "Nie":
                System.out.println("Szkoda, że się nie zgadzasz");
                break;
        }


        // użycie typu wyliczeniowego z osobnego pliku
        RozmiarButa but42 = RozmiarButa.R_42;
        float cmButa = but42.pobierzCM();
        System.out.println(but42 +" " + cmButa + " cm");
    }
}
