package edu.katheryn_azano.reto9.process;

import edu.katheryn_azano.reto9.ui.Idiomas;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Filtro {
    public static void contarVocales(List<String> palabras){
        long totalVocales = palabras.stream()
                .flatMapToInt(CharSequence::chars)
                .mapToObj(c -> (char)c)
                .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                .count();
        System.out.println(Idiomas.VOCALES + totalVocales);
    }

    public static void imprimirInicioVocales(List<String> palabras){
        palabras.stream()
                .filter(p -> !p.isEmpty() && "aeiouAEIOU".indexOf(p.charAt(0)) != -1)
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }

    public static void imprimirImpares(List<String> palabras){
        palabras.stream()
                .filter(p -> p.length() % 2 != 0 )
                .distinct()
                .forEach(System.out::println);
    }

    public static void palabraLarga(List<String> palabras){
        Optional<String> palabraMasLarga = palabras.stream()
                .max(Comparator.comparingInt(String::length));
        palabraMasLarga.ifPresent(System.out::println);
    }

    public static void palabraCorta(List<String> palabras){
        Optional<String> palabraMasCorta = palabras.stream()
                .min(Comparator.comparingInt(String::length));
        palabraMasCorta.ifPresent(System.out::println);
    }

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
