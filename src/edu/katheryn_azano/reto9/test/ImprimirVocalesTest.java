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
 * Clase de pruebas unitarias para el método imprimirInicioVocales de la clase Filtro.
 */
public class ImprimirVocalesTest {

    /**
     * Prueba que verifica que el método imprimirInicioVocales maneja correctamente un archivo de texto sin vocales.
     */
    @Test
    public void imprimirPalabrasSinVocales(){
        try {
            String filePath = "src/edu/katheryn_azano/reto9/resources/PalabrasConsonates.txt";
            List<String> palabras = Limpiador.obtenerPalabras(filePath);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            System.setOut(printStream);
            Filtro.imprimirInicioVocales(palabras);
            System.setOut(System.out);
            assertTrue(outputStream.toString().isEmpty());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Prueba que verifica que el método imprimirInicioVocales maneja correctamente una lista vacía de palabras.
     */
    @Test
    public void imprimirPalabrasVocalesVaciasTest(){
        try {
            List<String> palabras = Collections.emptyList();
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            System.setOut(printStream);
            Filtro.imprimirInicioVocales(palabras);
            System.setOut(System.out);
            assertTrue(outputStream.toString().isEmpty());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Prueba que verifica que el método imprimirInicioVocales imprime correctamente las palabras con vocales, tanto mayúsculas como minúsculas.
     */
    @Test
    public void imprimirVocalesMayusMinusTest(){
        try {
            List<String> palabras = Arrays.asList("Arbol","avion","estacionamineto","Iker","Oso");
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);
            System.setOut(printStream);
            Filtro.imprimirInicioVocales(palabras);
            String actualOutput = outputStream.toString();
            System.setOut(System.out);

            String[] lines = actualOutput.split(System.getProperty("line.separator"));
            for (String palabra : palabras) {
                boolean found = false;
                for (String line : lines) {
                    if (line.contains(palabra)) {
                        found = true;
                        break;
                    }
                }
                assertTrue(found);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Prueba que verifica que el método imprimirInicioVocales imprime correctamente las palabras con vocales, sin repetirlas.
     */
    @Test
    public void imprimirVocalesSinRepetirTest(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        List<String> palabras = Arrays.asList("arbol", "oso", "espejo", "arbol", "oso", "uva");
        Filtro.imprimirInicioVocales(palabras);
        String salidaActual = outputStream.toString();
        String salidaEsperada = "arbol\nespejo\noso\nuva\n".replaceAll("\r", "").toLowerCase();
        salidaActual = salidaActual.replaceAll("\r", "").toLowerCase();

        assertEquals(salidaEsperada, salidaActual);

        System.setOut(System.out);
    }

    /**
     * Prueba que verifica que el método imprimirInicioVocales imprime correctamente las palabras con vocales, tanto mayúsculas como minúsculas.
     */
    @Test
    public void imprimirPalabrasVocalesTest(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        List<String> palabras = Arrays.asList("Arbol", "escuela", "oso", "uva","Angela");
        Filtro.imprimirInicioVocales(palabras);
        String salidaActual = outputStream.toString();
        String salidaEsperada = "Angela\nArbol\nescuela\noso\nuva\n".replaceAll("\r", "").toLowerCase();
        salidaActual = salidaActual.replaceAll("\r", "").toLowerCase();
        assertEquals( salidaEsperada, salidaActual);
        System.setOut(System.out);
    }
}
