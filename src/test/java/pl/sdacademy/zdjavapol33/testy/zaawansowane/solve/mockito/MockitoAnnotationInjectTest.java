package pl.sdacademy.zdjavapol33.testy.zaawansowane.solve.mockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : zdjavapol33
 * @since : 14.03.2021
 **/
public class MockitoAnnotationInjectTest {

    /**
     * Inicjalizacja mockito
     */
    @Before
    public void before(){
        MockitoAnnotations.initMocks(this);// this-testowana klasa czyli ta klasa
    }

    /**
     * Zamokowane dane do słownika
     */
    @Mock
    Map<String,String> wordMap;

    @InjectMocks
    MyDictionary dic = new MyDictionary();

    public class MyDictionary{


        private Map<String, String> wordMap;

        public MyDictionary() {
            wordMap = new HashMap<>();
        }

        public MyDictionary(Map<String,String> wordMap){
            this.wordMap = wordMap;
        }

        /**
         * Metoda do pobierania tłumaczeń z mapy
         * @param word szukane słowo
         * @return znalezione słowo
         */
        public String getTranslation(String word){
            return wordMap.get(word);
        }

    }

    @Test
    public void whenUseInjectMockAnnotatnioTest(){

        // zaimplementować działanie danych wejściowych
        // które sa zamokowane
        when(wordMap.get("Help")).thenReturn("Pomocy");
        when(wordMap.get("Programmer")).thenReturn("Programista");

        // asercje
        assertEquals("Pomocy",dic.getTranslation("Help"));
        assertEquals("Programista",dic.getTranslation("Programmer"));
    }

}
