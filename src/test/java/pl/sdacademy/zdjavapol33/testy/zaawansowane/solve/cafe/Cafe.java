package pl.sdacademy.zdjavapol33.testy.zaawansowane.solve.cafe;

public class Cafe {

    boolean hasCafe;

    public Cafe(){
        hasCafe = false;
    }

    public void serveCoffe() {
        hasCafe = true;
    }

    public boolean canServeCoffee() {
        return hasCafe;
    }
}
