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
    private static boolean continuarJugando = true;

    public static void showMenu(){
        System.out.println("Seleccione un idioma / Choose a language: \nespañol / english");
        String idiomaSeleccionado = scanner.nextLine();
        Idiomas.getInstance(idiomaSeleccionado); // Instancia el idioma seleccionado
        System.out.println(Idiomas.MENU); // Muestra el menú principal
        choice = scanner.nextInt();
        scanner.nextLine();
    }

    public static void launchApp(){
        showMenu();
        while (choice != 0) {
            switch (choice){
                case 1:
                    //Elección para el tipo de juego P VS P
                    scanner.nextLine();
                    System.out.println(Idiomas.JUGADOR_1);
                    String jugador1 = scanner.nextLine();
                    System.out.println(Idiomas.SELECCION_SIMBOLO + Arrays.toString(simbolos));
                    String simbolo1 = scanner.nextLine();
                    System.out.println(Idiomas.JUGADOR_2);
                    String jugador2 = scanner.nextLine();
                    System.out.println(Idiomas.SELECCION_SIMBOLO + Arrays.toString(simbolos));
                    String simbolo2 = scanner.nextLine();
                    Persona persona1 = new Persona(jugador1, simbolo1);
                    Persona persona2 = new Persona(jugador2, simbolo2);
                    while (continuarJugando) {
                        // Generar turno para el jugador1 o jugador2
                        JuegoGato.generarTurnoPersona(persona1, persona2);
                        // Preguntar si desean volver a jugar
                        System.out.println(Idiomas.VOLVER_JUGAR);
                        String respuesta = scanner.nextLine();
                        if (!respuesta.equalsIgnoreCase("s")&&!respuesta.equalsIgnoreCase("y")) {
                            continuarJugando = false;
                        }
                    }
                    break;
                case 2:
                    //Elección para el tipo de juego P VS Comp
                    System.out.println(Idiomas.JUGADOR_1);
                    String jugador = scanner.nextLine();
                    System.out.println(Idiomas.SELECCION_SIMBOLO + Arrays.toString(simbolos));
                    String simbolo = scanner.nextLine();
                    Persona persona = new Persona(jugador,simbolo);

                    while (continuarJugando) {
                        // Generar turno para la computadora o jugador
                        JuegoGato.generarTurnoComputadora(persona);
                        // Preguntar si desean volver a jugar
                        System.out.println(Idiomas.VOLVER_JUGAR);
                        String respuesta = scanner.nextLine();
                        if (!respuesta.equalsIgnoreCase("s")&&!respuesta.equalsIgnoreCase("y")) {
                            continuarJugando = false;
                        }

                    }
                    break;
                default:
                    System.out.println(Idiomas.ERROR_GAMEMODE);
            }
            System.out.println(Idiomas.FINAL);
            break;
        }
    }
}
