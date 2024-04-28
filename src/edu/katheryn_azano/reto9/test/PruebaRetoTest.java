package edu.katheryn_azano.reto9.test;

import edu.katheryn_azano.reto9.process.Administrador;
import edu.katheryn_azano.reto9.process.Limpiador;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PruebaRetoTest {
    @Test
    public void obtenerPalabrasLibroVacioTest(){
        String filePath = "src/edu/katheryn_azano/reto9/resources/LibroVacio.txt";
        List<String> palabras = Limpiador.obtenerPalabras(filePath);
        assertTrue("La lista de palabras debería estar vacía para un libro vacío", palabras.isEmpty());
    }

    @Test
    public void obtenerPalabrasFiltroTest(){
        String filePath = "src/edu/katheryn_azano/reto9/resources/PalabrasConSimbolos.txt";
        List<String> palabras = Limpiador.obtenerPalabras(filePath);
        assertEquals("La lista de palabras debería contener 6 palabras después de eliminar caracteres especiales", 6, palabras.size());
        assertEquals("La primera palabra debería ser: 'Hla' ", palabras.get(0), "Hla");
        assertEquals("La segunda palabra debería ser: 'perro' ", palabras.get(1), "perro");
        assertEquals("La tercera palabra debería ser: 'gto' ", palabras.get(2), "gto");
        assertEquals("La cuarta palabra debería ser: 'casa' ", palabras.get(3), "casa");
        assertEquals("La quinta palabra debería ser: 'pati' ", palabras.get(4), "pati");
        assertEquals("La sexta palabra debería ser: 'migo' ", palabras.get(5), "migo");
    }

    @Test
    public void obtenerPalabrasSoloSignosTest(){
        String filePath = "src/edu/katheryn_azano/reto9/resources/Simbolos.txt";
        List<String> palabras = Limpiador.obtenerPalabras(filePath);
        assertTrue("La lista de palabras debe estar vacia",palabras.isEmpty());
    }

    @Test
    public void contarPalabrasTest(){
        List<String> palabras = Arrays.asList("hola","casa","hola","perro","hola","perro","hola");
        Map<String,Integer> frecuencia = Administrador.contarPalabras(palabras);
        assertEquals(3,frecuencia.size());
    }

    @Test
    public void ordenarFrecuenciaTest(){
        Map<String,Integer> frecuencia = new HashMap<>();
        frecuencia.put("hola", 4);
        frecuencia.put("casa",1);
        frecuencia.put("perro",2);
        frecuencia.put("oso",6);
        List<Map.Entry<String, Integer>> listaOrdenada = Administrador  .ordenarFrecuencia(frecuencia);
        assertEquals(4,listaOrdenada.size());
        assertEquals("oso", listaOrdenada.get(0).getKey());
        assertEquals(6, (int) listaOrdenada.get(0).getValue());
        assertEquals("hola", listaOrdenada.get(1).getKey());
        assertEquals(4, (int) listaOrdenada.get(1).getValue());
        assertEquals("perro", listaOrdenada.get(2).getKey());
        assertEquals(2, (int) listaOrdenada.get(2).getValue());
        assertEquals("casa", listaOrdenada.get(3).getKey());
        assertEquals(1, (int) listaOrdenada.get(3).getValue());
    }
}
