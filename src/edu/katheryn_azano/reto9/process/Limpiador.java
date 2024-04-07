package edu.katheryn_azano.reto9.process;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Limpiador {
    public static List<String> obtenerPalabras(String filePath){
        List<String> palabras = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(filePath));
            while (scanner.hasNext()) {
                String palabra = scanner.next().toLowerCase().replaceAll("[^a-zA-ZñÑ´¨]", "");
                palabras.add(palabra);
            }
            scanner.close();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return palabras;
    }
}
