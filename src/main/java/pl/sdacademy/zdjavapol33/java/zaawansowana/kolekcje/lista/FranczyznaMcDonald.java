package pl.sdacademy.zdjavapol33.java.zaawansowana.kolekcje.lista;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 13.09.2020
 **/
public class FranczyznaMcDonald implements McDonald{

    public FranczyznaMcDonald(String nazwa) {
        this.nazwa = nazwa;
    }

    String nazwa;

    @Override
    public void poproszeFrytki(float kwota) {
        System.out.println(nazwa+ "| poprosze frytki");
    }

    @Override
    public void poproszeMcFlury(float kwota) {
        System.out.println(nazwa+ "| poprosze McFlury");
    }
}
