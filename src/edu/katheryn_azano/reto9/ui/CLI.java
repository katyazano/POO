package edu.katheryn_azano.reto9.ui;

import edu.katheryn_azano.reto9.process.AdministradorDePalabras;

import java.util.Scanner;

public class CLI {
    private static final Scanner scanner = new Scanner(System.in);
    private static String libroSeleccionado;
    public static void showMenu(){
        System.out.println("Escoga un idioma (Choose a language:): ");
        System.out.println("A. Español (Spanish)");
        System.out.println("B. Ingles (English)");
        String idiomaSeleccionado = scanner.nextLine();
        Idiomas idiomas = Idiomas.getInstance(idiomaSeleccionado);
        System.out.println(Idiomas.MENU);
        libroSeleccionado = scanner.nextLine();
    }

    public static void launchApp(){
        showMenu();
        switch (libroSeleccionado){
            case "1":
                System.out.println(Idiomas.LIBRO_SELECCIONADO + Idiomas.GANSO_DE_ORO);
                System.out.println(Idiomas.LISTA_PALABRAS);
                break;
            case "2":
                System.out.println(Idiomas.LIBRO_SELECCIONADO + Idiomas.GATO_CON_BOTAS);
                System.out.println(Idiomas.LISTA_PALABRAS);
                break;
            case "3":
                System.out.println(Idiomas.LIBRO_SELECCIONADO + Idiomas.TRES_CERDITOS);
                System.out.println(Idiomas.LISTA_PALABRAS);
                break;
            case "4":
                System.out.println(Idiomas.LIBRO_SELECCIONADO + Idiomas.PINOCHO);
                System.out.println(Idiomas.LISTA_PALABRAS);
                break;
            case "5":
                System.out.println(Idiomas.LIBRO_SELECCIONADO + Idiomas.RICITOS);
                System.out.println(Idiomas.LISTA_PALABRAS);
                break;
            default:
                System.out.println(Idiomas.ERROR_LIBRO);
        }
        AdministradorDePalabras.setLibrosDisponibles(libroSeleccionado);
    }
}
