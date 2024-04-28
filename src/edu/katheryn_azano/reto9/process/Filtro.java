package edu.katheryn_azano.reto9.process;

import edu.katheryn_azano.reto9.ui.Idiomas;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Clase que contiene métodos para filtrar y procesar listas de palabras.
 */
public class Filtro {

    /**
     * Cuenta el número total de vocales en una lista de palabras.
     * @param palabras La lista de palabras.
     * @return El número total de vocales.
     */
    public static long contarVocales(List<String> palabras){
        palabras = palabras.stream().filter(Objects::nonNull).collect(Collectors.toList());
        long totalVocales = palabras.stream()
                .flatMapToInt(CharSequence::chars)
                .mapToObj(c -> (char) c)
                .filter(c -> "aeiouAEIOUáéíóúÁÉÍÓÚ".indexOf(c) != -1)
                .count();
        System.out.println(Idiomas.VOCALES + totalVocales);
        return totalVocales;
    }

    /**
     * Imprime las palabras que comienzan con vocal, ordenadas de forma ascendente.
     * @param palabras La lista de palabras.
     */
    public static void imprimirInicioVocales(List<String> palabras){
        palabras.stream()
                .filter(p -> !p.isEmpty() && "aeiouAEIOU".indexOf(p.charAt(0)) != -1)
                .sorted(String::compareToIgnoreCase)
                .distinct()
                .forEach(System.out::println);
    }

    /**
     * Imprime las palabras de longitud impar y únicas.
     * @param palabras La lista de palabras.
     */
    public static void imprimirImpares (List<String> palabras){
        palabras.stream()
                .filter(p -> p.length() % 2 != 0 )
                .distinct()
                .forEach(System.out::println);

    }

    /**
     * Imprime la palabra más larga de la lista.
     * @param palabras La lista de palabras.
     */
    public static void palabraLarga(List<String> palabras){
        Optional<String> palabraMasLarga = palabras.stream()
                .max(Comparator.comparingInt(String::length));
        palabraMasLarga.ifPresent(System.out::println);
    }

    /**
     * Imprime la palabra más corta de la lista.
     * @param palabras La lista de palabras.
     */
    public static void palabraCorta(List<String> palabras){
        Optional<String> palabraMasCorta = palabras.stream()
                .min(Comparator.comparingInt(String::length));
        palabraMasCorta.ifPresent(System.out::println);
    }

    /**
     * Imprime la primera palabra que cumple con el criterio de tener vocales al inicio y al final, y una longitud mínima de 5 caracteres.
     * @param palabras La lista de palabras.
     */
    public static void criterioVocales(List<String> palabras){
        Optional<String> criterioVocal = palabras.stream()
                .filter(p -> p.matches("^[aeiouAEIOU].*[aeiouAEIOU]$") && p.length() >= 5)
                .findFirst();
        if (criterioVocal.isPresent()) {
            System.out.println(Idiomas.CRITERIO_VOCAL + criterioVocal.get());
        } else {
            System.out.println(Idiomas.CRITERIO_ERROR);
        }

    }
}
