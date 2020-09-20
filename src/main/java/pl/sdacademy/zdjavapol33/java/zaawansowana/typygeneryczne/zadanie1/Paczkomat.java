package pl.sdacademy.zdjavapol33.java.zaawansowana.typygeneryczne.zadanie1;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 19.09.2020
 **/
public class Paczkomat<Z extends Zawartosc> {

    private String lokalizacja;
    private Paczka paczka;
    private String nazwa;
    private int MAX_WEIGHT = 25;

    public String getLokalizacja() {
        return lokalizacja;
    }
 
    public Paczkomat(String nazwa, String lokalizacja) {
        this.nazwa = nazwa;
        this.lokalizacja = lokalizacja;
    }
 
    public void nadaj(Paczka<Z> paczka) throws Exception {
        if (paczka.getWaga() > 25) {
            throw new WeightOverloadException();
        }
        if(paczka.getWysokosc()>Gabaryt.C.getWysokosc()){
            throw new Exception("Wprowadzona wysokość: " + paczka.getWysokosc() + " jest zbyt duża");
        }
        if(paczka.getSzerokosc()>Gabaryt.C.getSzerokosc()){
            throw new Exception("Wprowadzona szerokość: " + paczka.getSzerokosc() + " jest zbyt duża");
        }
        if(paczka.getDlugosc()>Gabaryt.C.getDlugosc()){
            throw new Exception("Wprowadzona długość: " + paczka.getWysokosc() + " jest zbyt duża");
        }
 
 
        Gabaryt gabarytyPaczki = wyliczGabaryt(paczka);
        switch (gabarytyPaczki) {
            case A:
                System.out.println("Proszę przygotować 12,99zl");
                break;
            case B:
                System.out.println("Proszę przygotować 13,99zl");
                break;
            case C:
                System.out.println("Proszę przygotować 15,99zl");
                break;
 
        }
 
    }
 
    private Gabaryt wyliczGabaryt(Paczka<Z> paczka) {
        if (Gabaryt.A.getDlugosc() >= paczka.getDlugosc() && MAX_WEIGHT >= paczka.getWaga() && Gabaryt.A.getSzerokosc() >= paczka.getSzerokosc()) {
            return Gabaryt.A;
        } else if (Gabaryt.B.getDlugosc() >= paczka.getDlugosc() && MAX_WEIGHT >= paczka.getWaga() && Gabaryt.B.getSzerokosc() >= paczka.getSzerokosc()) {
            return Gabaryt.B;
        } else if (Gabaryt.C.getDlugosc() >= paczka.getDlugosc() && MAX_WEIGHT >= paczka.getWaga() && Gabaryt.C.getSzerokosc() >= paczka.getSzerokosc()) {
            return Gabaryt.C;
        }
        return null;
 
    }
 
}
