package edu.katheryn_azano.reto4.ui;

import edu.katheryn_azano.reto4.process.Manager;
import java.util.Scanner;

public class CLI {
    /**
     * Muestra el menú de opciones y solicita al usuario que ingrese su elección.
     * @return La opción seleccionada por el usuario.
     */
     public static int showMenu(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("1. Realizar venta de boleto \n2. Mostrar datos de la lista de ventas \n0. Finalizar programa");
         System.out.println("Ingresa la opción deseada: ");
         return scanner.nextInt();
    }

    /**
     * Se inicia el programa, mostrando el menú y manejando las opciones seleccionadas por el usuario.
     */
    public static void launchApp(){
        int choice = showMenu();
        while (choice >= 0){
            switch (choice){
                case 1:
                    Manager.ventaBoleto();
                    break;

                case 2:
                    Manager.showData();
                    break;

                case 0:
                    System.out.println("------- Fin del programa v 1.1 -------");
                    return;

                default:
                    System.out.println("Ingrese una opción válida\n");
            }
            choice = showMenu();
        }
    }
}
