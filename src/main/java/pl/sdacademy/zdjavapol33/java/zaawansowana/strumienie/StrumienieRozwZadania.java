package pl.sdacademy.zdjavapol33.java.zaawansowana.strumienie;

import pl.sdacademy.zdjavapol33.java.zaawansowana.strumienie.data.Repository;
import pl.sdacademy.zdjavapol33.java.zaawansowana.strumienie.data.User;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;


/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 19.09.2020
 **/
public class StrumienieRozwZadania {

    private final Repository repository = new Repository();

    /**
     * Zwróć set zawierający wszystkich użytkowników korzystając z metody **repository.getUsers**.
     */
    public Set<User> findAllUsers() {
        return
                repository.getUsers().collect(Collectors.toSet());
    }

    /**
     * Znajdź wszystkich użytkowników, których imię zaczyna się od prefiksu. Użyj funkcji `String.startsWith`.
     */
    public List<User> findAllUsersWithFirstNameStartingWith(String prefix) {
        return
                repository.getUsers().filter(u -> u.getFirstName().startsWith(prefix)).collect(Collectors.toList());
    }


    /**
     * Zwróć posortowaną listę unikalnych wartości wieku użytkowników.
     */
    public List<Integer> findAges() {
        return repository.getUsers().map(User::getAge).distinct().sorted().collect(Collectors.toList());
    }

    /**
     * Znajdź największy wiek użytŁkownika.
     */
    public int findMaxAge() {
        return findAges().stream().max((a1,a2)-> a1.compareTo(a2)).get();

//        return findAges().stream().max(Integer::compareTo).get();
    }


    /**
     * Zwróć listę imion użytkowników.
     */
    public List<String> allFirstNames() {
        return repository.getUsers().map(User::getFirstName).collect(Collectors.toList());
    }

    /**
     * Wyszukaj pierwszego użytkownika po podanym adresie email.
     */
    public Optional<User> getByEmail(String email) {
        return repository.getUsers().filter(u -> u.getEmail().equalsIgnoreCase(email)).findFirst();
    }


    /**
     * Zwróć listę imion i nazwisk (połączonych jako jeden łańcuch, ze spacją jako separatorem) użytkowników z literami zamienionymi na duże.
     */
    public Stream<String> allNamesUppercased() {
        return repository.getUsers().map(u -> u.getFirstName() + " " + u.getLastName()).map(String::toUpperCase);
        //return repository.getUsers().map(u-> u.getFirstName().toUpperCase()+" "+u.getLastName().toUpperCase());
    }

    /**
     * Zwróc wszystkich użytkowników starszych niż wiek podany jako parametr.
     */
    public Stream<User> findAllOlderThan(int age) {
        return repository.getUsers().filter(u -> u.getAge() > age);
    }

    /**
     * Zwróć imiona wszystkich użytkowników podzielone przecinkami ako jeden łańcuch znaków.
     */
    public String joined() {
        return repository.getUsers().map(User::getFirstName).collect(Collectors.joining(","));
    }

    /**
     * Zwróć listę wszystkich użytkowników limitowaną do ilości podanej jako parametr.
     */
    public List<User> limited(int limit) {
        return repository.getUsers().limit(limit).collect(Collectors.toList());
    }

    /**
     * Zwróć mapę użytkowników pogrupowanych według wieku.
     */
    public Map<Integer, List<User>> groupByAge() {
        return repository.getUsers().collect(groupingBy(User::getAge, toList()));

    }

    /**
     * Zwróć mapę wszystkich użytkowników pogrupowanych według domeny ich emaili (domena to adres po @).
     */
    public Map<String, List<User>> groupByDomain() {
        return repository.getUsers().collect(Collectors.groupingBy(u -> u.getEmail().split("@")[1]));
        //return repository.getUsers().collect(groupingBy(u -> u.getEmail().substring(u.getEmail().indexOf("@") + 1, u.getEmail().length()), toList()));
    }

    /**
     * Zwróć listę tytułów wszystkich maili wszystkich użytkowników korzystając z metody **repository.getMessageTitles**.
     */
    public Stream<String> getAllMessageTitles() {
        return repository.
                getUsers().
                map(User::getEmail).
                flatMap(e -> repository.getMessageTitles(e));
    }

    /**
     * Zróć listę łańcuchów znaków zawierającą email oraz tytuł wiadomości, na przykład:
     * 'email@gmail.com - Promocja!' ale tylko jeżeli domena emaila zgadza się z podaną w parametrze.
     * Dla domen różych od parametru, zwróć pojedyńczą wartość: 'email@wp.pl - Brak wiadomości'.
     */
    public Stream<String> getAllMessageTitlesOfDomain(String domain) {
        return repository.getUsers().flatMap(u -> {
            if (u.getEmail().split("@")[1].equals(domain)) {
                return repository.getMessageTitles(u.getEmail()).map(t -> u.getEmail() + " - " + t);
            } else {
                return Stream.of(u.getEmail() + " - " + "Brak wiadomości");
            }
        });
    }
}
