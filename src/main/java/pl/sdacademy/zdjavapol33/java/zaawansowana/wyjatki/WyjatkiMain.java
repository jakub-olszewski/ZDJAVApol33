package pl.sdacademy.zdjavapol33.java.zaawansowana.wyjatki;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 19.09.2020
 **/
public class WyjatkiMain {

    // throws - informacja o zrzucaniu wyjatku
    public static void main(String[] args) throws Exception {

        // łapanie wyjatku - obsłużenie wyjatku
        try {
            String napis = null;
            napis.isEmpty();
        }catch (NullPointerException e){

            // błędem będzie pusty catch
            //e.printStackTrace();// informacje o wyjatku

            if(e.getMessage()==null){
                System.err.println("Wystapił bład z wartoscia null");
            }else{
                System.err.println("Bład "+e.getMessage());
            }

        }

        try {
            Obliczenia.pobierzLiczbeSekund(1001);
        } catch (TooBigArgumentException e) {// obsłużenie wyjatku szczegółowego
            System.out.println("Blad : " + e.getMessage());
        } catch (Exception e) {// obsłużenie wyjatku ogólnego
            // w przypadku illegalArgumentException
            // zostanie złapany przez Exception
            // ponieważ illegalArgumentException extends Exception
            System.err.println("Error :" + e.getMessage());
        }

        boolean jestPrad = false;
        if(!jestPrad){
            // zrzucanie wyjatku - nastepuje przerwanie programu
            throw new Exception("Brak pradu!");
        }

        System.out.println("Tego napisu nie bedzie gdy zostaje zrzucowy wyjatek");
    }
}
