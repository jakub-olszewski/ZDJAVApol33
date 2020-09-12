package pl.sdacademy.zdjavapol33.java.zaawansowana.klasy.wewnetrzne;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 12.09.2020
 **/
public class KlasyWewnetrzneMain {

    public static void main(String[] args) {

        // poniżej tworzenie zakladki statycznie
        // bez potrzeby tworzenia Segregatora
        Segregator.Zakladka zakladkaFakturyStatyczna =
                Segregator.stworzZakladka("Faktury");

        // ponizej tworzenie segregatora z zakladkami
        Segregator dokumenty = new Segregator("Dokumenty");
        dokumenty.utworzZakladke("Rachunki za prad");
        dokumenty.utworzZakladke("Rachunki za internet");
        dokumenty.wypiszZakladki();

        // metoda włóż zakladke
        // kropka poniżej oznacza pod klasę, czyli
        // klase Zakladka w klasie Segregator
        Segregator.Zakladka zakladkaFakturyZDokumentow =
                dokumenty.nowaZakladka("Faktury");

        dokumenty.wlozZakladke(zakladkaFakturyZDokumentow);

    }
}
