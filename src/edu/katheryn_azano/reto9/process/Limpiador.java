package edu.katheryn_azano.reto9.process;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Clase donde se extraen las palabras del cuento
 */
public class Limpiador {
    /**
     *  Método para obtener las palabras de un archivo de texto y limpiarlas
     */
    public static List<String> obtenerPalabras(String filePath) {
        try (Stream<String> lines = Files.lines(Paths.get(filePath))){
            return lines
                    .flatMap(line -> Stream.of(line.split("\\s+")))
                    .map(word -> word.replaceAll("[^a-zA-ZñÑáéíóúüÁÉÍÓÚÜ]", ""))
                    .filter(word -> !word.isEmpty())
                    .collect(Collectors.toList());
        }catch (IOException e){
                throw new RuntimeException(e);
        }
    }
}
