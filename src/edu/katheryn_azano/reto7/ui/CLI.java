package edu.katheryn_azano.reto7.ui;

import edu.katheryn_azano.reto7.data.DatosEntrada;

import java.util.Scanner;

public class CLI {
    public static void launchApp(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("------ Calculadora Aritmetica ------");
        System.out.println("Seleccione una de las operaciones siguientes : ");
        System.out.println("1. Suma \n2. Resta \n3. Multiplicación \n4. División \n5. Modulo \n6. Potencia \n7. Raiz \n8. Logaritmo");
        System.out.println("Ingrese el numero de la opción deseada: ");
        int operacion = scanner.nextInt();


    }
}
