package pl.sdacademy.zdjavapol33.java.zaawansowana.programowanie.volatiles;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : tarr2019java4-tdd-project
 * @since : 04.06.2020
 **/
public class VolatileTest {
    /**
     * Co się dzieje gdy usuniemy volatile  ?
     *
     * Każdy wątek ma swój własny stos, a więc własną kopię zmiennych, do których ma dostęp.
     * Kiedy wątek jest tworzony, kopiuje wartość wszystkich dostępnych zmiennych
     * w swojej własnej pamięci. Słowo volatile jest używane do powiedzenia jvm
     * „Uwaga, ta zmienna może być modyfikowana w innym wątku”.
     * Bez tego słowa kluczowego JVM może dokonać pewnych optymalizacji, takich jak
     * nigdy nie odświeżanie tych lokalnych kopii w niektórych wątkach.
     * Zmienna siła wymusza na gwincie aktualizację oryginalnej zmiennej dla każdej zmiennej.
     * Zmienne słowo kluczowe może być stosowane do każdego rodzaju zmiennej,
     * zarówno prymitywnej, jak i obiektów!
     */

    private static volatile int MY_INT = 0;
//    private static int MY_INT = 0;

    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

    static class ChangeListener extends Thread {
        @Override
        public void run() {
            int local_value = MY_INT;
            while ( local_value < 5){
                if( local_value!= MY_INT){ // brak volatile powoduje, że wartości będą wiecznie równe ponieważ
                    // kompilator tworzy kopię i modyfikacje drugiego wątku nie mają wpływu na local_value
                    System.out.println("Got Change for MY_INT : "+ MY_INT);
                    local_value= MY_INT;
                }
            }
        }
    }

    static class ChangeMaker extends Thread{
        @Override
        public void run() {

            int local_value = MY_INT;
            while (MY_INT <5){
                System.out.println("Incrementing MY_INT to "+(local_value+1));
                MY_INT = ++local_value;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        }
    }
}