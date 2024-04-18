package edu.katheryn_azano.reto9.process;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase donde se extraen las palabras del cuento
 */
public class Limpiador {
    /**
     *  Método para obtener las palabras de un archivo de texto y limpiarlas
     */
    public static List<String> obtenerPalabras(String filePath) {
        List<String> palabras = new ArrayList<>();
        try {
            // Crea un Scanner para leer el archivo de texto
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNext()) {
                // Lee cada palabra, la convierte a minúsculas y elimina caracteres no alfabéticos
                String palabra = scanner.next().toLowerCase().replaceAll("[^a-zA-ZñÑ´¨]", "");
                palabras.add(palabra); // Agrega la palabra a la lista de palabras
            }
            scanner.close(); // Cierra el Scanner
        } catch (Exception e) {
            throw new RuntimeException(e); // Lanza una excepción en caso de error
        }
        return palabras; // Retorna la lista de palabras
    }
}
