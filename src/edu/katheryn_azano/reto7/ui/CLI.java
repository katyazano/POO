package edu.katheryn_azano.reto7.ui;

import edu.katheryn_azano.reto7.process.*;

import java.util.Scanner;

public class CLI {
    private static Scanner scanner = new Scanner(System.in);
    private static double x = 0,y = 0,resultado;

    private static void getData(){
        System.out.println("Ingrese el primer numero: ");
        x = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        y = scanner.nextDouble();
    }
    public static void launchApp(){
        System.out.println("------ Calculadora Aritmetica ------");
        System.out.println("Seleccione una de las operaciones siguientes : ");
        System.out.println("1. Suma \n2. Resta \n3. Multiplicación \n4. División \n5. Modulo \n6. Potencia \n7. Raiz \n8. Logaritmo");
        System.out.println("Ingrese el numero de la opción deseada: ");
        int operacion = scanner.nextInt();
        switch (operacion){
            case 1:
                getData();
                OperacionAritmetica suma = new Suma();
                resultado = suma.calcular(x,y);
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                getData();
                OperacionAritmetica resta = new Resta();
                resultado = resta.calcular(x,y);
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                getData();
                OperacionAritmetica multiplicacion = new Multiplicacion(); // Inicializa la funcion
                resultado = multiplicacion.calcular(x,y); // Toma los datos y realiza la multiplicación
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                break;
            case 4:
                getData();
                OperacionAritmetica division = new Division();
                resultado = division.calcular(x,y);
                System.out.println("El resultado del modulo es: " + resultado);
                break;
            case 5:
                getData();
                OperacionAritmetica modulo = new Modulo();
                resultado = modulo.calcular(x,y);
                System.out.println("El resultado del modulo es: " + resultado);
                break;
            case 6:
                getData();
                OperacionAritmetica potencia = new Potencia();
                resultado = potencia.calcular(x,y);
                System.out.println("El resultado de la potencia es: " + resultado);
                break;
            case 7:
                getData();
                OperacionAritmetica raiz = new Raiz();
                resultado = raiz.calcular(x,y);
                System.out.println("El resultado de la raiz es: " + resultado);
                break;
            case 8:
                getData();
                OperacionAritmetica logaritmo = new Logaritmo();
                resultado = logaritmo.calcular(x,y);
                System.out.println("El resultado del logaritmo es: " + resultado);
                break;
            default:
                System.out.println("Ingrese una opción valida");
                break;
        }
    }
}
