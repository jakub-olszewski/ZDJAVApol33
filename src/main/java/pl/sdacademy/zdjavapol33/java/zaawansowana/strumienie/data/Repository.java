package pl.sdacademy.zdjavapol33.java.zaawansowana.strumienie.data;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 19.09.2020
 **/
import pl.sdacademy.zdjavapol33.java.zaawansowana.strumienie.data.User;

import java.util.stream.Stream;

public class Repository {

    public Stream<User> getUsers() {
        return Stream.of(
                new User("Roman", "Kozielski", 20, "rkoz@adres.pl"),
                new User("Darek", "Glanowski", 54, "dg@wb.pl"),
                new User("Bartek", "Koźlarz", 44, "bartek@kozlarz.pl"),
                new User("Sławomir", "Nitka", 34, "nit@wb.pl"),
                new User("Agnieszka", "Więcławek", 36, "aw@gmail.com"),
                new User("Wojciech", "Więcławek", 34, "ww@gmail.com")
        );
    }

    public Stream<String> getMessageTitles(String email) {

        switch (email) {
            case "rkoz@adres.pl":
                return Stream.of("Kup mleko.", "Jak się masz?");
            case "dg@wb.pl":
                return Stream.of("Faktura VAT", "Twoja rezerwacja została potwierdzona");
            case "bartek@kozlarz.pl":
                return Stream.of("Oferta pracy", "Promocja");
            case "nit@wb.pl":
                return Stream.of("Otrzymaj 100 złotych losów");
            case "aw@gmail.com":
                return Stream.of("Twoja subskrypcja wygasła");
            case "ww@gmail.com":
                return Stream.of("Zaproszenie", "Oferta kupna");
            default:
                return Stream.empty();
        }

    }


}