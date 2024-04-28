package edu.katheryn_azano.reto9.test;

import edu.katheryn_azano.reto9.process.Filtro;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertTrue;

/**
 * Clase de pruebas unitarias para la clase Filtro.
 */
public class FiltroTest {

    /**
     * Prueba que verifica que el método palabraLarga imprime correctamente la palabra más larga de una lista de palabras.
     */
    @Test
    public void palabraLargaTest(){
        List<String> palabras = Arrays.asList("parangaricutirmicuaro", "hola", "mundo", "manzanillo");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Filtro.palabraLarga(palabras);
        assertTrue(outContent.toString().contains("parangaricutirmicuaro"));
    }

    /**
     * Prueba que verifica que el método palabraCorta imprime correctamente la palabra más corta de una lista de palabras.
     */
    @Test
    public void palabraCortaTest(){
        List<String> palabras = Arrays.asList("parangaricutirmicuaro", "hola", "mundo", "manzanillo");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Filtro.palabraCorta(palabras);
        assertTrue(outContent.toString().contains("hola"));
    }

    /**
     * Prueba que verifica que el método criterioVocales imprime correctamente la primera palabra que cumple con cierto criterio de vocales de una lista de palabras.
     */
    @Test
    public void criterioVocalesTest(){
        List<String> palabras = Arrays.asList("osito", "naranja", "azul", "ojo", "casita");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Filtro.criterioVocales(palabras);
        assertTrue(outContent.toString().contains("osito"));
    }
}
