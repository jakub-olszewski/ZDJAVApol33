package pl.sdacademy.zdjavapol33.java.zaawansowana.nio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : ZDJAVApol33
 * @since : 20.09.2020
 **/
public class NIOMain {

    public static void main(String[] args) {

        String lokalizacja = "C:\\Users\\trener\\Desktop\\";
        /**
         * Uwaga. Na pulpicie stwórz pliki plik0.txt oraz plik1.txt
         */
        String plik0 = "plik0.txt", plik1 = "plik1.txt";

        Path source = Paths.get(lokalizacja + plik0);

        try {
            // atrybuty pliku
            BasicFileAttributes attributes = Files.readAttributes(source, BasicFileAttributes.class);

            // lista wierszy z pliku
            List<String> linesFromFile = Files.readAllLines(source);

            System.out.println("Plik "+source.getFileName());
            System.out.println("Rozmiar "+attributes.size()+ " bytes");

            System.out.println("Zawartość pliku:");
            int counter = 0;

            Map<String,String> mapaSlow = new HashMap<>();

            for (String row : linesFromFile){
                System.out.println(counter+"|"+row);

                // zamieniamy dane słowo na KONIK
                if(row.contains("konik")){
                    String zamienionaLinia = linesFromFile.get(counter).replace("konik","KONIKA");
                    linesFromFile.set(counter,zamienionaLinia);
                }

                counter++;
            }

            // zapis zmian do pliku
            Files.write(source,linesFromFile, StandardCharsets.UTF_8);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
