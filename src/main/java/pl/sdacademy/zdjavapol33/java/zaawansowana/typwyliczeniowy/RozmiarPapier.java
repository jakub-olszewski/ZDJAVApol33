package pl.sdacademy.zdjavapol33.java.zaawansowana.typwyliczeniowy;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 19.09.2020, So
 **/
public enum RozmiarPapier {
    A1(12,23),A4(23,34);

    private float dl;
    private float szer;

    @Override
    public String toString() {
        return "RozmiarPapier "+name()+ "{"+
                "dl=" + dl +
                ", szer=" + szer +
                '}';
    }

    RozmiarPapier(float dl, float szer) {
        this.dl = dl;
        this.szer = szer;
    }

    public float getDl() {
        return dl;
    }

    public float getSzer() {
        return szer;
    }



}
