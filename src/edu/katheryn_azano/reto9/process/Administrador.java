package edu.katheryn_azano.reto9.process;

import edu.katheryn_azano.reto9.ui.Idiomas;
import java.util.*;

/**
 * Clase que administra las palabras de los cuentos y realiza operaciones sobre ellas.
 */
public class Administrador {
    // Mapa que contiene los libros disponibles y sus rutas de archivo
    private static final Map<String, String> librosDisponibles = new HashMap<>();

    /**
     * Establece los libros disponibles y muestra las 10 palabras más repetidas.
     * @param libroSeleccionado El libro seleccionado.
     */
    public static void setLibrosDisponibles(String libroSeleccionado) {
        // Asigna las rutas de archivo de los libros disponibles al mapa
        librosDisponibles.put("1", "src/edu/katheryn_azano/reto9/resources/ElGansoDeOro.txt");
        librosDisponibles.put("2", "src/edu/katheryn_azano/reto9/resources/ElGatoConBotas.txt");
        librosDisponibles.put("3", "src/edu/katheryn_azano/reto9/resources/LosTresCerditos.txt");
        librosDisponibles.put("4", "src/edu/katheryn_azano/reto9/resources/Pinocho.txt");
        librosDisponibles.put("5", "src/edu/katheryn_azano/reto9/resources/RicitosDeOro.txt");

        // Obtiene la ruta de archivo del libro seleccionado
        String filePath = librosDisponibles.get(libroSeleccionado);

        List<String> palabras = Limpiador.obtenerPalabras(filePath);
        Map<String, Integer> frecuenciaPalabras = contarPalabras(palabras);

        List<Map.Entry<String, Integer>> listaOrdenada = ordenarFrecuencia(frecuenciaPalabras);
        imprimirPalabras(listaOrdenada);
        Filtro.contarVocales(palabras);
        System.out.println(Idiomas.INICIO_VOCALES);
        Filtro.imprimirInicioVocales(palabras);
        System.out.println(Idiomas.IMPARES);
        Filtro.imprimirImpares(palabras);
        System.out.println(Idiomas.PALABRA_LARGA);
        Filtro.palabraLarga(palabras);
        System.out.println(Idiomas.PALABRA_CORTA);
        Filtro.palabraCorta(palabras);
        Filtro.criterioVocales(palabras);

    }

    /**
     * Imprime las palabras más repetidas junto con su frecuencia, limitando la lista a las 10 palabras más repetidas.
     * @param listaOrdenada Lista de palabras ordenadas por frecuencia.
     */
    public static void imprimirPalabras(List<Map.Entry<String, Integer>> listaOrdenada){
        int contador = 0;
        for (Map.Entry<String, Integer> entrada : listaOrdenada) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue() + " " + Idiomas.VECES);
            contador++;
            if (contador == 10) break;
        }
    }

    /**
     * Cuenta la frecuencia de las palabras en una lista.
     * @param palabras Lista de palabras.
     * @return Mapa que contiene la frecuencia de cada palabra.
     */
    public static Map<String, Integer> contarPalabras(List<String> palabras) {
        Map<String, Integer> frecuencia = new HashMap<>();
        for (String palabra : palabras) {
            frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
        }
        return frecuencia;
    }

    /**
     * Ordena la frecuencia de las palabras de forma descendente.
     * @param frecuencia Mapa que contiene la frecuencia de las palabras.
     * @return Lista de palabras ordenada por frecuencia.
     */
    public static List<Map.Entry<String, Integer>> ordenarFrecuencia(Map<String, Integer> frecuencia) {
        List<Map.Entry<String, Integer>> listaOrdenada = new ArrayList<>(frecuencia.entrySet());
        listaOrdenada.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        return listaOrdenada;
    }
}
