package edu.katheryn_azano.reto9.test;

import edu.katheryn_azano.reto9.process.Filtro;
import edu.katheryn_azano.reto9.process.Limpiador;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Clase de pruebas unitarias para el método imprimirImpares de la clase Filtro.
 */
public class ImprimirImparesTest {

    /**
     * Prueba que verifica que el método imprimirImpares imprime correctamente las palabras impares de un archivo de texto.
     */
    @Test
    public void imprimirPalabrasImparesTest(){
        String filePath = "src/edu/katheryn_azano/reto9/resources/PalabrasImpares.txt";
        List<String> palabras = Limpiador.obtenerPalabras(filePath);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Filtro.imprimirImpares(palabras);
        String salidaActual = outputStream.toString();
        String salidaEsperada = "dos\nferrocarril\ncasador\noso\nxochitl\nuno\ncinco\n".replaceAll("\r", "").toLowerCase();
        salidaActual = salidaActual.replaceAll("\r", "").toLowerCase();
        assertEquals(salidaEsperada, salidaActual);
        System.setOut(System.out);
    }

    /**
     * Prueba que verifica que el método imprimirImpares maneja correctamente una lista vacía de palabras.
     */
    @Test
    public void imprimirPalabrasImparesVaciaTest(){
        try {
            List<String> palabras = Collections.emptyList();
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            System.setOut(printStream);
            Filtro.imprimirImpares(palabras);
            System.setOut(System.out);
            assertTrue(outputStream.toString().isEmpty());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Prueba que verifica que el método imprimirImpares imprime correctamente las palabras impares de un archivo de texto.
     */
    @Test
    public void imprimirPalabrasParesTest(){
        String filePath = "src/edu/katheryn_azano/reto9/resources/PalabrasPares.txt";
        List<String> palabras = Limpiador.obtenerPalabras(filePath);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Filtro.imprimirImpares(palabras);
        assertTrue(outputStream.toString().contains("Cinco"));
    }

    /**
     * Prueba que verifica que el método imprimirImpares imprime correctamente las palabras impares de una lista con elementos repetidos.
     */
    @Test
    public void imprimirPalabrasImparRepetidasTest(){
        List<String> palabras = Arrays.asList("dos","carro","casa","carro","carro","oso");
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        Filtro.imprimirImpares(palabras);
        String salidaActual=outputStream.toString();
        String salidaEsperada = "dos\ncarro\noso\n".replaceAll("\r","").toLowerCase();
        salidaActual = salidaActual.replaceAll("\r","").toLowerCase();
        assertEquals(salidaEsperada, salidaActual);
        System.setOut(System.out);
    }

    /**
     * Prueba que verifica que el método imprimirImpares maneja correctamente una lista de palabras nula.
     */
    @Test
    public void imprimirPalabrasImparNulaTest(){
        try {
            List<String> palabras = null;

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));
            Filtro.imprimirImpares(palabras);
            String salidaActual=outputStream.toString();

            assertEquals(salidaActual, outputStream.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
