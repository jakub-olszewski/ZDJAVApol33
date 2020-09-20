package pl.sdacademy.zdjavapol33.java.zaawansowana.io;

import java.io.*;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 20.09.2020
 **/
public class IOMain {

    public static void main(String[] args) {

        /**
         * Uwaga. Na pulpicie stwórz pliki plik0.txt oraz plik1.txt
         */
        String plik0 = "plik0.txt", plik1 = "plik1.txt";

        String lokalizacja = "C:\\Users\\trener\\Desktop\\";
        FileReader in = null;
        FileWriter out = null;
        try {
            // in - input
             in = new FileReader(lokalizacja + plik0);
            // out - output
             out = new FileWriter(lokalizacja + plik1);

            copy(in,out);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(in!=null) in.close();
                if(out!=null) out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


    /**
     * Metoda do kopiowania
     * @param reader - plik z ktorego kopiujemy
     * @param writer - plik do ktorego zapisujemy
     * @throws IOException wyjatek ktory moze wystapic
     */
    private static void copy(Reader reader, Writer writer ) throws IOException {

        int c;// char czyli znak
        while( (c = reader.read()) != -1) {
            writer.write(c);
        }
    }
}
