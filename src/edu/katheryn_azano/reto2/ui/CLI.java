package edu.katheryn_azano.reto2.ui;

import edu.katheryn_azano.reto2.process.Procesos;
import java.util.Scanner;

public class CLI {
    static Scanner scanner = new Scanner(System.in);
    static int eleccion = 0;

    public static int showMenu(){
        System.out.println("Elige una de las siguientes opciones: \n1. Comprar cajas de papel \n2. Vender cajas de papel \n3. Mostrar reporte \n4. Salir del programa");
        System.out.println("Ingrese la opción deseada: ");
        eleccion = scanner.nextInt();
        return eleccion;
    }

    public static void launchApp(){
        Procesos.login();
        eleccion = showMenu();

        while(eleccion <= 4){
            switch (eleccion) {
                case 1:
                    Procesos.comprarCajas();
                    eleccion = showMenu();
                    break;
                case 2:
                    Procesos.venderCajas();
                    eleccion = showMenu();
                    break;
                case 3:
                    Procesos.reporte();
                    eleccion = showMenu();
                    break;
                case 4:
                    Procesos.resumen();
                    return; //sirve para salir del metodo y del programa

                default:
                    System.out.println("Opción invalida. Seleccione una correcta");
                    eleccion = showMenu();
            }
        }
    }
}
