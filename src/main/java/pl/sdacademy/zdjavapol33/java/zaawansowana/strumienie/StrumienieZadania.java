package pl.sdacademy.zdjavapol33.java.zaawansowana.strumienie;

import pl.sdacademy.zdjavapol33.java.zaawansowana.strumienie.data.Repository;
import pl.sdacademy.zdjavapol33.java.zaawansowana.strumienie.data.User;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 19.09.2020
 **/
public class StrumienieZadania {

    private final Repository repository = new Repository();

    /**
     * Zwróć set zawierający wszystkich użytkowników korzystając z metody **repository.getUsers**.
     */
    public Set<User> findAllUsers() {

        // przyklad
        // return repository.getUsers().sorted().filter(e->e).map(User::getAge);
        return null;
    }

    /**
     * Znajdź wszystkich użytkowników, których imię zaczyna się od prefiksu. Użyj funkcji `String.startsWith`.
     */
    public List<User> findAllUsersWithFirstNameStartingWith(String prefix) {
        return null;
    }

    /**
     * Znajdź największy wiek użytkownika. Jeżeli nie zostaną podani żadni użytkownicy, to zwróć 0.
     */
    public int findMaxAge() {
        return 0;
    }

    /**
     * Zwróć posortowaną listę unikalnych wartości wieku użytkowników.
     */
    public List<Integer> findAges() {
        return null;
    }

    /**
     * Zwróć listę imion użytkowników.
     */
    public List<String> allFirstNames() {
        return null;
    }

    /**
     * Wyszukaj pierwszego użytkownika po podanym adresie email.
     */
    public Optional<User> getByEmail(String email) {
        return null;
    }


    /**
     * Zwróć listę imion i nazwisk (połączonych jako jeden łańcuch, ze spacją jako separatorem) użytkowników z literami zamienionymi na duże.
     */
    public Stream<String> allNamesUppercased() {
        return null;
    }

    /**
     * Zwróc wszystkich użytkowników starszych niż wiek podany jako parametr.
     */
    public Stream<User> findAllOlderThan(int age) {
        return null;
    }

    /**
     * Zwróć imiona wszystkich użytkowników podzielone przecinkami ako jeden łańcuch znaków.
     */
    public String joined() {
        return null;
    }

    /**
     * Zwróć listę wszystkich użytkowników limitowaną do ilości podanej jako parametr.
     */
    public List<User> limited(int limit) {
        return null;
    }

    /**
     * Zwróć mapę użytkowników pogrupowanych według wieku.
     */
    public Map<Integer, List<User>> groupByAge() {
        return null;
    }

    /**
     * Zwróć mapę wszystkich użytkowników pogrupowanych według domeny ich emaili (domena to adres po @).
     */
    public Map<String, List<User>> groupByDomain() {
        return null;
    }

    /**
     * Zwróć listę tytułów wszystkich maili wszystkich użytkowników korzystając z metody **repository.getMessageTitles**.
     */
    public Stream<String> getAllMessageTitles() {
        return null;
    }

    /**
     * Zróć listę łańcuchów znaków zawierającą email oraz tytuł wiadomości, na przykład:
     * 'email@gmail.com - Promocja!' ale tylko jeżeli domena emaila zgadza się z podaną w parametrze.
     * Dla domen różych od parametru, zwróć pojedyńczą wartość: 'email@wp.pl - Brak wiadomości'.
     */
    public Stream<String> getAllMessageTitlesOfDomain(String domain) {
        return null;
    }
}
