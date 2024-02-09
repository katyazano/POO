package edu.katheryn_azano.reto3.diccionario.process;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Diccionario {
    private static String[] palabras;
    private static String[] significados;

    public Diccionario(String[] palabras, String[] significados) {
        this.palabras = palabras;
        this.significados = significados;
    }

    public static void enlistar() {
        IntStream.range(1, palabras.length)
                .forEach(i -> System.out.println(i + ": " + palabras[i]));
    }

    public static int getIndex(String palabra){
        int index = 0;

        while(index < palabras.length){
            if (palabra.equalsIgnoreCase(palabras[index])) return index;
            index++;
        } return -1;
    }

    private String getDescription(int index){
        if (index == -1) return "La palabra que busca no está en el diccionario";{
        } return significados[index];
    }

    public String buscarSignificados(String palabra){
        return getDescription(getIndex(palabra));
    }

    public static void detalle(){
        System.out.println("Cantidad de palabras del diccionario: " + palabras.length);
        for (String palabra : palabras){
            int index = getIndex(palabra);
            System.out.printf("%s, cantidad de caracteres: %s, cantidad de caracteres de significado: %s\n",palabra, palabra.length(), significados[index].length());
        }
    }
}
