package edu.katheryn_azano.reto9.process;

import edu.katheryn_azano.reto9.ui.Idiomas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdministradorDePalabras {
    private static final Map<String, String> librosDisponibles = new HashMap<>();
    public static void setLibrosDisponibles(String libroSeleccionado) {
        librosDisponibles.put("1", "C:\\Users\\kathe\\IdeaProjects\\untitled\\src\\edu\\katheryn_azano\\reto9\\resources\\ElGansoDeOro.txt");
        librosDisponibles.put("2", "C:\\Users\\kathe\\IdeaProjects\\untitled\\src\\edu\\katheryn_azano\\reto9\\resources\\ElGatoConBotas.txt");
        librosDisponibles.put("3", "C:\\Users\\kathe\\IdeaProjects\\untitled\\src\\edu\\katheryn_azano\\reto9\\resources\\LosTresCerditos.txt");
        librosDisponibles.put("4", "C:\\Users\\kathe\\IdeaProjects\\untitled\\src\\edu\\katheryn_azano\\reto9\\resources\\Pinocho.txt");
        librosDisponibles.put("5", "C:\\Users\\kathe\\IdeaProjects\\untitled\\src\\edu\\katheryn_azano\\reto9\\resources\\RicitosDeOro.txt");
        String filePath = librosDisponibles.get(libroSeleccionado);
        List<String> palabras = Limpiador.obtenerPalabras(filePath);
        Map<String, Integer> frecuenciaPalabras = contarPalabras(palabras);
        List<Map.Entry<String, Integer>> listaOrdenada = ordenarFrecuencia(frecuenciaPalabras);

        int contador = 0;
        for (Map.Entry<String, Integer> entrada : listaOrdenada) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue() + " " + Idiomas.VECES);
            contador++;
            if (contador == 10) break;
        }
    }

    public static Map<String, Integer> contarPalabras(List<String> palabras){
        Map<String, Integer> frecuencia = new HashMap<>();
        for(String palabra : palabras){
            frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
        } return frecuencia;
    }

    public static List<Map.Entry<String, Integer>> ordenarFrecuencia(Map<String, Integer> frecuencia){
        List<Map.Entry<String, Integer>> listaOrdenada = new ArrayList<>(frecuencia.entrySet());
        listaOrdenada.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        return listaOrdenada;
    }
}
