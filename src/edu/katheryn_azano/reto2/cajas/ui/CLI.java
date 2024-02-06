package edu.katheryn_azano.reto2.cajas.ui;

import edu.katheryn_azano.reto2.cajas.process.Procesos;
import java.util.Scanner;

public class CLI {
    // Variable para almacenar la eleccion del usuario
    static int eleccion = 0;

    /**
     * Metodo para mostrar el menu y obtener la eleccion del usuario
     * @return variable eleccion
     */
    public static int showMenu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige una de las siguientes opciones: \n1. Comprar cajas de papel \n2. Vender cajas de papel \n3. Mostrar reporte \n4. Salir del programa");
        System.out.println("Ingrese la opción deseada: ");
        eleccion = scanner.nextInt();
        return eleccion;
    }

    /**
     * Metodo para inicializar la aplicacion y gestionar las opciones del menú
     */
    public static void launchApp(){
        // Realiza el proceso de inicio de sesión
        Procesos.login();
        // Obtener la elección del usuario
        eleccion = showMenu();

        // Bucle que continuará hasta que el usuario elija salir (opción 4)
        while(eleccion <= 4){
            switch (eleccion) {
                case 1:
                    // Compra de cajas
                    Procesos.comprarCajas();
                    eleccion = showMenu();
                    break;
                case 2:
                    // Venta de cajas
                    Procesos.venderCajas();
                    eleccion = showMenu();
                    break;
                case 3:
                    // Reporte
                    Procesos.reporte();
                    eleccion = showMenu();
                    break;
                case 4:
                    // Realiza el resumen y sale del programa
                    Procesos.resumen();
                    return; //sirve para salir del metodo y del programa

                default:
                    // Mensaje de opción inválida
                    System.out.println("Opción invalida. Seleccione una correcta");
                    eleccion = showMenu();
            }
        }
    }
}
