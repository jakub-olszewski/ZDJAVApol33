package pl.sdacademy.zdjavapol33.testy.zaawansowane.solve.mockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

/**
 * @author : Jakub Olszewski [http://github.com/jakub-olszewski]
 * @project : zdjavapol33
 * @since : 14.03.2021
 **/
public class MockitoAnnotationSpyTest {

    /**
     * Częściowa atrapa listy
     */
    @Spy
    List<String> spyList = new ArrayList();// inicjalizajca jest konieczna

    @Before
    public void before(){
        MockitoAnnotations.initMocks(this);// this-testowana klasa czyli ta klasa
    }

    @Test
    public void whenUseSpyAnnotationTest(){

        spyList.add("one");
        spyList.add("two");

        assertEquals(spyList.size(),2);

        when(spyList.size()).thenReturn(2020);// implementacja działania częściowej atrapy

        assertEquals(spyList.size(),2020);

    }

    @Test
    public void whenNotUseSpyAnnotationTest(){

        List<String> spyListOnlyHere = spy(new ArrayList<>());// używamy new w spy

        spyListOnlyHere.add("one");
        spyListOnlyHere.add("two");

        assertEquals(spyListOnlyHere.size(),2);

        // weryfikacje
        verify(spyListOnlyHere,times(2)).add(anyString());

    }

}
