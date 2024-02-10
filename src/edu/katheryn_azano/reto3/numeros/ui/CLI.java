package edu.katheryn_azano.reto3.numeros.ui;

import edu.katheryn_azano.reto3.numeros.process.CalculadoraPares;
import java.util.Scanner;

public class CLI {
    // Se declara un objeto Scanner para la entrada del usuario.
    public static Scanner scanner = new Scanner(System.in);

    // Se crea una instancia de CalculadoraPares para realizar cálculos.
    CalculadoraPares cp = new CalculadoraPares();

    // Variables para almacenar la cantidad de filas y columnas ingresadas por el usuario.
    private int filas;
    private int columnas;

    /**
     * Muestra un menú para que el usuario ingrese la cantidad de filas y columnas deseadas.
     */
    public void showMenu(){
        System.out.println("Indica la cantidad de filas que deseas: ");
        this.filas = scanner.nextInt();
        System.out.println("Indica la cantidad de columnas que deseas: ");
        this.columnas = scanner.nextInt();

        if (filas != columnas){
            System.out.println("Ingresa cantidades iguales");
            showMenu();
        }
    }

    /**
     * Inicia la aplicación mostrando el menú y realizando cálculos con la CalculadoraPares.
     */
    public void launchApp(){
        showMenu();
        // Se crea el arreglo bidimensional
        int[][] tabla = cp.array(filas,columnas);
        // Se calculan numeros pares e impares
        cp.paresImpares(tabla);
        System.out.println("La suma de los valores del vector es: " + cp.suma(tabla));
    }
}
