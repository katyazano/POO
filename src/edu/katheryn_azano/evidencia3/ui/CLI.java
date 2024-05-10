package edu.katheryn_azano.evidencia3.ui;

import edu.katheryn_azano.evidencia3.process.JuegoGato;

import java.util.Scanner;

public class CLI {
    private static final Scanner scanner = new Scanner(System.in);
    private static int choice;

    public static void showMenu(){
        System.out.println("Seleccione un idioma / Choose a language: \nespañol / spanish \ningles / english");
        String idiomaSeleccionado = scanner.nextLine();
        Idiomas.getInstance(idiomaSeleccionado); // Instancia el idioma seleccionado
        System.out.println(Idiomas.MENU); // Muestra el menú principal
        choice = scanner.nextInt();
    }

    public static void launchApp(){
        do {
            showMenu();
            switch (choice){
                case 1:
                    //Elección para el tipo de juego P VS P
                    System.out.println("Ingrese el nombre del jugador 1: ");
                    String jugador1 = scanner.nextLine();
                    System.out.println("Ingrese el nombre del jugador 2: ");
                    String jugador2 = scanner.nextLine();
                    JuegoGato.generarTurnoPersona(jugador1,jugador2);

                    break;
                case 2:
                    //Elección para el tipo de juego P VS Comp
                    System.out.println("Ingrese el nombre del jugador 1: ");
                    String jugador = scanner.nextLine();
                    JuegoGato.generarTurnoComputadora(jugador);

                    break;
                default:
                    System.out.println(Idiomas.ERROR_GAMEMODE);
            }
        }while (choice != 0);
    }
}
