package edu.katheryn_azano.reto2.promedios.ui;

import edu.katheryn_azano.reto2.promedios.process.Calculadora;

import java.util.Scanner;

public class CLI {
    /**
     * este metodo inicializa el programa
     */
    public static void launchApp(){
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario cuantas calificaciones quiere evaluar
        System.out.println("Ingrese la cantidad de calificaciones que desea capturar: ");
        int cantidadCalificaciones = scanner.nextInt();

        // Validar que la calificación sea un número positivo y diferente a 0
        if (cantidadCalificaciones <= 0){
            System.out.println("Ingrese una calificación válida");
            return;
        }

        // Array de calificaciones
        double[] calificaciones = new double [cantidadCalificaciones];

        // Solicitar al usuario cada calificación
        for(int i = 0; i < cantidadCalificaciones; i++){
            System.out.println("Ingrese la calificacion " + (i + 1) + ":");
            calificaciones[i] = scanner.nextDouble();
        }

        // Utiliza el metodo de la clase Calculadora para sacar el promedio
        double promedio = Calculadora.calculadoraPromedios(calificaciones);
        System.out.println("El promedio del alumno es: " + promedio);

        //sirve para evitar fugas de memoria y liberar recursos
        scanner.close();
    }
}
