package edu.katheryn_azano.reto3.numeros.ui;

import edu.katheryn_azano.reto3.numeros.process.CalculadoraPares;

import java.util.Arrays;
import java.util.Scanner;

public class CLI {
    public static Scanner scanner = new Scanner(System.in);

    CalculadoraPares cp = new CalculadoraPares();

    private int filas;
    private int columnas;

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

    public void launchApp(){
        showMenu();
        int[][] tabla = cp.array(filas,columnas);
        cp.paresImpares(tabla);
        System.out.println("La suma de los valores del vector es: " + cp.suma(tabla));
    }
}
