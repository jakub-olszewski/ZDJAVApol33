package pl.sdacademy.zdjavapol33.testy.zaawansowane.solve.calculator;

public interface Calculator {

    /**
     * Metoda odpowiedzialna za wcisniecie przycisku z cyfrą
     * @param number wciśniety przycisk na kalkulatorze
     */
    void pressNumber(int number);

    /**
     * Metoda odpowiedzialna za pobranie zawartości wyświetlacza
     * @return zawartość wyświetlacza
     */
    String display();

    /**
     * Metoda dodaje liczbę A do liczby B
     * @param numberA liczba pierwsza
     * @param numberB liczba druga
     */
    void add(int numberA, int numberB);

    /**
     * Metoda czyści zawartość wyświetlacza
     */
    void clear();

    /**
     * Metoda odejmuje liczbe a od b
     * @param numberA liczba pierwsza
     * @param numberB liczba druga
     */
    void sub(int numberA, int numberB);

    /**
     * Metoda mnoży liczbe a przez b
     * @param numberA liczba pierwsza
     * @param numberB liczba druga
     */
    void multi(int numberA, int numberB);

    /**
     * Metoda dzieli liczbe a przez b
     * @param numberA liczba pierwsza
     * @param numberB liczba druga
     */
    void div(int numberA, int numberB);
}
