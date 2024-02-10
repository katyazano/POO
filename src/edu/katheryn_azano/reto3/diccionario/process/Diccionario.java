package edu.katheryn_azano.reto3.diccionario.process;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * La clase Diccionario proporciona funcionalidades para gestionar un diccionario de palabras y sus significados.
 */
public class Diccionario {
    private static String[] palabras;
    private static String[] significados;

    /**
     * Constructor de la clase Diccionario.
     * @param palabras Un array de Strings que contiene las palabras del diccionario.
     * @param significados Un array de Strings que contiene los significados correspondientes a las palabras del diccionario.
     */
    public Diccionario(String[] palabras, String[] significados) {
        this.palabras = palabras;
        this.significados = significados;
    }

    /**
     * Método estático que imprime la lista de palabras en el diccionario junto con sus índices.
     */
    public static void enlistar() {
        IntStream.range(1, palabras.length)
                .forEach(i -> System.out.println(i + ": " + palabras[i]));
    }

    /**
     * Método estático que devuelve el índice de una palabra en el diccionario.
     * @param palabra La palabra cuyo índice se desea buscar.
     * @return El índice de la palabra en el diccionario, o -1 si la palabra no está presente.
     */
    public static int getIndex(String palabra){
        int index = 0;

        while(index < palabras.length){
            if (palabra.equalsIgnoreCase(palabras[index])) return index;
            index++;
        } return -1;
    }

    /**
     * Método privado que devuelve el significado de una palabra dado su índice.
     * @param index El índice de la palabra cuyo significado se desea obtener.
     * @return El significado de la palabra si el índice es válido, o un mensaje de error si el índice es -1.
     */
    private String getDescription(int index){
        if (index == -1) return "La palabra que busca no está en el diccionario";{
        } return significados[index];
    }

    /**
     * Método público que devuelve el significado de una palabra.
     * @param palabra La palabra cuyo significado se desea buscar.
     * @return El significado de la palabra si está presente en el diccionario, o un mensaje de error si no lo está.
     */
    public String buscarSignificados(String palabra){
        return getDescription(getIndex(palabra));
    }

    /**
     * Método estático que imprime detalles sobre las palabras del diccionario.
     * Incluye la cantidad de palabras, la cantidad de caracteres de cada palabra, y la cantidad de caracteres de sus significados.
     */
    public static void detalle(){
        System.out.println("Cantidad de palabras del diccionario: " + palabras.length);
        for (String palabra : palabras){
            int index = getIndex(palabra);
            System.out.printf("%s, cantidad de caracteres: %s, cantidad de caracteres de significado: %s\n",palabra, palabra.length(), significados[index].length());
        }
    }
}
