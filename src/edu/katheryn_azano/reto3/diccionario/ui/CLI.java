package edu.katheryn_azano.reto3.diccionario.ui;

import edu.katheryn_azano.reto3.diccionario.process.Diccionario;
import java.util.Scanner;

public class CLI {
    // Se declara un objeto Scanner para la entrada del usuario.
    public static Scanner scanner = new Scanner(System.in);

    /**
     * Muestra el menú de opciones y solicita al usuario que ingrese su elección.
     * @return La opción seleccionada por el usuario.
     */
    public static int showMenu(){
        System.out.println("1. Enlistar palabras del diccionario \n2. Buscar palabras en el diccionario \n3. Detalle del diccionario \n4. Finalizar programa");
        System.out.println("Ingrese la opción deseada: ");
        return scanner.nextInt();
    }

    /**
     * Inicia la aplicación del diccionario y maneja la interacción del usuario.
     * @param diccionario El diccionario con el que se va a interactuar.
     */
    public static void launchApp(Diccionario diccionario){
        int choice = showMenu();
        while (choice <= 4){
            switch (choice){
                case 1:
                    // Enlista todas las palabras del diccionario.
                    Diccionario.enlistar();
                    break;

                case 2:
                    // Busca una palabra en el diccionario y muestra su significado.
                    Diccionario.enlistar();
                    System.out.println("Ingrese la palabra que quiere conocer: ");
                    String palabra = scanner.next();
                    String significado = diccionario.buscarSignificados(palabra);
                    System.out.printf("%s: %s\n",palabra,significado);
                    break;

                case 3:
                    // Muestra el detalle del diccionario.
                    Diccionario.detalle();
                    break;

                case 4:
                    // Finaliza la aplicación.
                    System.out.println("Fin del programa");
                    return;

                default:
                    // Maneja una opción inválida.
                    System.out.println("Opción invalida. Seleccione una correcta");
            }
            choice = showMenu();
        }
    }
}
