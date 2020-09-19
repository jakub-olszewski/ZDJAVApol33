package pl.sdacademy.zdjavapol33.java.zaawansowana.typwyliczeniowy;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 19.09.2020, So
 **/
public enum RozmiarButa {

    R_35(20.5f),R_40(26f),R_41(26.5f),R_42(27.5f);// po przecinku robimy kolejne rozmiary

    // pole
    private float dlugoscCM;

    // metoda
    public float pobierzCM() {
        return dlugoscCM;
    }

    // konstruktor
    RozmiarButa(float dlugoscCM){
        this.dlugoscCM = dlugoscCM;
    }
}
