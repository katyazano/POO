package edu.katheryn_azano.evidencia3.ui;

import edu.katheryn_azano.evidencia3.process.JuegoGato;
import edu.katheryn_azano.evidencia3.process.Jugador;
import edu.katheryn_azano.evidencia3.process.Persona;

import java.util.Arrays;
import java.util.Scanner;

public class CLI {
    private static final Scanner scanner = new Scanner(System.in);
    private static int choice;
    private static String[] simbolos = {"X", "O", "#", "*", "@", "&", "$", "!", "?", "+"};

    public static void showMenu(){
        System.out.println("Seleccione un idioma / Choose a language: \nespañol / english");
        String idiomaSeleccionado = scanner.nextLine();
        Idiomas.getInstance(idiomaSeleccionado); // Instancia el idioma seleccionado
        System.out.println(Idiomas.MENU); // Muestra el menú principal
        choice = scanner.nextInt();
    }

    public static void launchApp(){
        showMenu();
        while (choice != 0) {
            switch (choice){
                case 1:
                    //Elección para el tipo de juego P VS P
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del jugador 1: ");
                    String jugador1 = scanner.nextLine();
                    System.out.println("Elige el simbolo del jugador 1 de la siguiente lista: " + Arrays.toString(simbolos));
                    String simbolo1 = scanner.nextLine();
                    System.out.println("Ingrese el nombre del jugador 2: ");
                    String jugador2 = scanner.nextLine();
                    System.out.println("Elige el simbolo del jugador 2 de la siguiente lista: " + Arrays.toString(simbolos));
                    String simbolo2 = scanner.nextLine();
                    Persona persona1 = new Persona(jugador1, simbolo1);
                    Persona persona2 = new Persona(jugador2, simbolo2);
                    JuegoGato.generarTurnoPersona(persona1, persona2);

                    break;
                case 2:
                    //Elección para el tipo de juego P VS Comp
                    System.out.println("Ingrese el nombre del jugador: ");
                    String jugador = scanner.nextLine();

                    break;
                default:
                    System.out.println(Idiomas.ERROR_GAMEMODE);
            }
            showMenu();
        }
    }
}
