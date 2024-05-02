package edu.katheryn_azano.reto9.test;

import edu.katheryn_azano.reto9.process.Filtro;
import edu.katheryn_azano.reto9.process.Limpiador;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Clase de pruebas unitarias para la clase Filtro.
 */
public class ContarVocalesTest {

    /**
     * Prueba para contar vocales en una lista vacía.
     */
    @Test
    public void contarVocalesListaVaciaTest(){
        List<String> palabras = Collections.emptyList();
        assertEquals(0, Filtro.contarVocales(palabras));
    }

    /**
     * Prueba para contar vocales en una lista con una vocal.
     */
    @Test
    public void contarVocalesUnaVocalTest(){
        List<String> palabras = Arrays.asList("Navaja" ,"casa", "cama");
        assertEquals(7,Filtro.contarVocales(palabras));
    }

    /**
     * Prueba para contar vocales en una lista con solo consonantes.
     */
    @Test
    public void contarVocalesConsonantesTest(){
        String filePath = "src/edu/katheryn_azano/reto9/resources/Expresiones.txt";
        List<String> palabras = Limpiador.obtenerPalabras(filePath);
        assertEquals(0,Filtro.contarVocales(palabras));
    }

    /**
     * Prueba para contar vocales en una lista con palabras que contienen acentos.
     */
    @Test
    public void contarVocalesAcentosTest(){
        List<String> palabras = Arrays.asList("Mamá", "Papá", "árbol", "avión", "envió");
        assertEquals(12, Filtro.contarVocales(palabras));
    }

    /**
     * Prueba para contar vocales en una lista que contiene valores nulos.
     */
    @Test
    public void contarVocalesNullTest(){
        List<String> palabras = Arrays.asList("perro", null, "pollo", "murcielago", null);
        assertEquals(9,Filtro.contarVocales(palabras));
    }
}
