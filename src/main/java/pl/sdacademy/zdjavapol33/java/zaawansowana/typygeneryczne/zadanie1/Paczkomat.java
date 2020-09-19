package pl.sdacademy.zdjavapol33.java.zaawansowana.typygeneryczne.zadanie1;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 19.09.2020
 **/
public class Paczkomat<Z extends Zawartosc> {

    /**
     * Konstruktor do tworzenia paczkomatu
     * @param nazwa
     * @param lokalizacja
     */
    public Paczkomat(String nazwa, String lokalizacja) {
        this.nazwa = nazwa;
        this.lokalizacja = lokalizacja;
    }

    String nazwa;
    String lokalizacja;

    /**
     * Metoda ktora nadaje paczke
     * sprawdzenie gabarytów na podstawie gabarytów zwracamy cene wysyłki
     * @param paczka
     */
    public void nadaj(Paczka<Z> paczka){
        // TODO sprawdzmy wagę paczki jeśli >25kg zrzucamy wyjatek

        //paczka.getDlugosc(); // szerogosc wysykosc ... pobieramy wlasciwosci i porównujemy z gabaryty
        // TODO na podstawie właściwyości wyliczamy Gabaryt
        Gabaryt gabarytPaczki = wyliczGabaryt(paczka);
        // TODO na podstawie gabarytu zwracamy cene
        switch(gabarytPaczki){
            case A:
                // cena paczki
                System.out.println("Proszę przygotować :12,99 zł");

        }
    }

    /**
     * Metoda wylicz gabaryt na podstawie wielkości paczki
     * @param paczka
     * @return
     */
    private Gabaryt wyliczGabaryt(Paczka<Z> paczka){
        // TODO pobieramy z paczka wlasciwosc np dlugosc
        // porównujemy z Gabarytem
        // Gabaryt.A.getDlugosc() - dlugosc gabarytu A
        return null;
    }

}
