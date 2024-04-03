package edu.katheryn_azano.reto7.ui;

import edu.katheryn_azano.reto7.process.*;

import java.util.Scanner;

public class CLI {
    private static Scanner scanner = new Scanner(System.in);
    private static double x = 0, y = 0, resultado;

    // Método privado para obtener los datos de entrada
    private static void getData() {
        System.out.println("Ingrese el primer numero: ");
        x = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        y = scanner.nextDouble();
    }

    // Método público para lanzar la aplicación de la calculadora
    public static void launchApp() {
        // Menú principal de la calculadora
        System.out.println("------ Calculadora Aritmetica ------");
        System.out.println("Seleccione una de las operaciones siguientes : ");
        System.out.println("1. Suma \n2. Resta \n3. Multiplicación \n4. División \n5. Modulo \n6. Potencia \n7. Raiz \n8. Logaritmo");
        System.out.println("Ingrese el numero de la opción deseada: ");
        int operacion = scanner.nextInt();
        switch (operacion) {
            case 1:
                getData(); // Obtiene los datos de entrada
                OperacionAritmetica suma = new Suma(); // Crea una instancia de Suma
                resultado = suma.calcular(x, y); // Calcula la suma
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                getData(); // Obtiene los datos de entrada
                OperacionAritmetica resta = new Resta(); // Crea una instancia de Resta
                resultado = resta.calcular(x, y); // Calcula la resta
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                getData(); // Obtiene los datos de entrada
                OperacionAritmetica multiplicacion = new Multiplicacion(); // Crea una instancia de Multiplicacion
                resultado = multiplicacion.calcular(x, y); // Calcula la multiplicacion
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                break;
            case 4:
                getData(); // Obtiene los datos de entrada
                OperacionAritmetica division = new Division(); // Crea una instancia de Division
                resultado = division.calcular(x, y); // Calcula la division
                System.out.println("El resultado de la division es: " + resultado);
                break;
            case 5:
                getData(); // Obtiene los datos de entrada
                OperacionAritmetica modulo = new Modulo(); // Crea una instancia de Modulo
                resultado = modulo.calcular(x, y); // Calcula el modulo
                System.out.println("El resultado del modulo es: " + resultado);
                break;
            case 6:
                getData(); // Obtiene los datos de entrada
                OperacionAritmetica potencia = new Potencia(); // Crea una instancia de Potencia
                resultado = potencia.calcular(x, y); // Calcula la potencia
                System.out.println("El resultado de la potencia es: " + resultado);
                break;
            case 7:
                getData(); // Obtiene los datos de entrada
                OperacionAritmetica raiz = new Raiz(); // Crea una instancia de Raiz
                resultado = raiz.calcular(x, y); // Calcula la raiz
                System.out.println("El resultado de la raiz es: " + resultado);
                break;
            case 8:
                getData(); // Obtiene los datos de entrada
                OperacionAritmetica logaritmo = new Logaritmo(); // Crea una instancia de Logaritmo
                resultado = logaritmo.calcular(x, y); // Calcula el logaritmo
                System.out.println("El resultado del logaritmo es: " + resultado);
                break;
            default:
                System.out.println("Ingrese una opción valida");
                break;
        }
    }
}
