package pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie.immutable;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 04.06.2020
 **/
public class Main {

    static final int MAX_WIDTH = 1080;// final jest tutaj istotne ze wzgledu na niezmienność!

    public static void main(String[] args) {
        /**
         * Gdy użyjemy 'final' dla MAX_WIDTH
         *
         * wewnętrzny stan obiektu niezmiennego pozostaje stały w czasie,
         * możemy bezpiecznie dzielić go między wiele wątków.
         *
         * Możemy również używać go swobodnie i żaden z odwołujących się do niego obiektów
         * nie zauważy żadnej różnicy, możemy powiedzieć, że niezmienne obiekty są wolne od efektów ubocznych.
         */
    }
}
