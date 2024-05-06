package edu.katheryn_azano.evidencia3.ui;

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
                    // llamar metodos para PvP
                    break;
                case 2:
                    // llamar metodos para PvComp
                    break;
                default:
                    System.out.println(Idiomas.ERROR_GAMEMODE);
            }
        }while (choice != 0);
    }
}
