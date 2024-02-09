package edu.katheryn_azano.reto3.diccionario.ui;

import edu.katheryn_azano.reto3.diccionario.process.Diccionario;
import java.util.Scanner;

public class CLI {
    static int choice = 0;
    public static Scanner scanner = new Scanner(System.in);

    public static int showMenu(){
        System.out.println("1. Enlistar palabras del diccionario \n2. Buscar palabras en el diccionario \n3. Detalle del diccionario \n4. Finalizar programa");
        System.out.println("Ingrese la opción deseada: ");
        return scanner.nextInt();
    }

    public static void launchApp(Diccionario diccionario){
        choice = showMenu();
        while (choice <= 4){
            switch (choice){
                case 1:
                    Diccionario.enlistar();
                    break;

                case 2:
                    Diccionario.enlistar();
                    System.out.println("Ingrese la palabra que quiere conocer: ");
                    String palabra = scanner.next();
                    String significado = diccionario.buscarSignificados(palabra);
                    System.out.printf("%s: %s\n",palabra,significado);
                    break;

                case 3:
                    Diccionario.detalle();
                    break;

                case 4:
                    System.out.println("Fin del programa");
                    return;

                default:
                    System.out.println("Opción invalida. Seleccione una correcta");
            }
            choice = showMenu();
        }
    }
}
