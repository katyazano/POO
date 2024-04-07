package edu.katheryn_azano.reto9.process;

import edu.katheryn_azano.reto9.ui.Idiomas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdministradorDePalabras {
    // Mapa que contiene los libros disponibles y sus rutas de archivo
    private static final Map<String, String> librosDisponibles = new HashMap<>();

    // Método para establecer los libros disponibles y mostrar las 10 palabras más repetidas
    public static void setLibrosDisponibles(String libroSeleccionado) {
        // Asigna las rutas de archivo de los libros disponibles al mapa
        librosDisponibles.put("1", "C:\\Users\\kathe\\IdeaProjects\\untitled\\src\\edu\\katheryn_azano\\reto9\\resources\\ElGansoDeOro.txt");
        librosDisponibles.put("2", "C:\\Users\\kathe\\IdeaProjects\\untitled\\src\\edu\\katheryn_azano\\reto9\\resources\\ElGatoConBotas.txt");
        librosDisponibles.put("3", "C:\\Users\\kathe\\IdeaProjects\\untitled\\src\\edu\\katheryn_azano\\reto9\\resources\\LosTresCerditos.txt");
        librosDisponibles.put("4", "C:\\Users\\kathe\\IdeaProjects\\untitled\\src\\edu\\katheryn_azano\\reto9\\resources\\Pinocho.txt");
        librosDisponibles.put("5", "C:\\Users\\kathe\\IdeaProjects\\untitled\\src\\edu\\katheryn_azano\\reto9\\resources\\RicitosDeOro.txt");

        // Obtiene la ruta de archivo del libro seleccionado
        String filePath = librosDisponibles.get(libroSeleccionado);

        // Obtiene la lista de palabras del libro y cuenta la frecuencia de cada una
        List<String> palabras = Limpiador.obtenerPalabras(filePath);
        Map<String, Integer> frecuenciaPalabras = contarPalabras(palabras);

        // Ordena la frecuencia de palabras y muestra las 10 más repetidas
        List<Map.Entry<String, Integer>> listaOrdenada = ordenarFrecuencia(frecuenciaPalabras);
        int contador = 0;
        for (Map.Entry<String, Integer> entrada : listaOrdenada) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue() + " " + Idiomas.VECES);
            contador++;
            if (contador == 10) break;
        }
    }

    // Método para contar la frecuencia de las palabras en una lista
    public static Map<String, Integer> contarPalabras(List<String> palabras) {
        Map<String, Integer> frecuencia = new HashMap<>();
        for (String palabra : palabras) {
            frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
        }
        return frecuencia;
    }

    // Método para ordenar la frecuencia de palabras de forma descendente
    public static List<Map.Entry<String, Integer>> ordenarFrecuencia(Map<String, Integer> frecuencia) {
        List<Map.Entry<String, Integer>> listaOrdenada = new ArrayList<>(frecuencia.entrySet());
        listaOrdenada.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        return listaOrdenada;
    }
}
