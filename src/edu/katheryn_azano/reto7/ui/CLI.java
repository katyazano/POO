package edu.katheryn_azano.reto7.ui;

import edu.katheryn_azano.reto7.process.*;

import java.util.Scanner;

public class CLI {
    private static Scanner scanner = new Scanner(System.in);
    private static double x = 0;
    private static double y = 0;
    private static Idiomas idiomas = new Espanol();

    public static void showMenu() {
        System.out.println("Seleccione un idioma / Select a language" + "\nA. Español (Spanish) \nB. Inglés (English)");
        String idioma = scanner.nextLine();

        switch (idioma){
            case "A":
                idiomas = new Espanol();
                break;
            case "B":
                idiomas = new Ingles();
                break;
        }
        System.out.println(idiomas.MENU);
    }

    // Método privado para obtener los datos de entrada
    private static void getData() {
        System.out.println(idiomas.INGRESAR_PRIMERNUMERO);
        x = scanner.nextDouble();
        System.out.println(idiomas.INGRESAR_SEGUNDONUMERO);
        y = scanner.nextDouble();
    }

    // Método público para lanzar la aplicación de la calculadora
    public static void launchApp() {
        showMenu();
        int choice = scanner.nextInt();
        double resultado;
        OperacionAritmetica operacion = null;
        switch (choice) {
            case 1:
                getData(); // Obtiene los datos de entrada
                OperacionAritmetica suma = new Suma(); // Crea una instancia de Suma
                resultado = suma.calcular(x, y); // Calcula la suma
                System.out.println("El resultado de la suma es: " + idiomas.FINAL);
                break;
            case 2:
                getData(); // Obtiene los datos de entrada
                OperacionAritmetica resta = new Resta(); // Crea una instancia de Resta
                resultado = resta.calcular(x, y); // Calcula la resta
                System.out.println("El resultado de la resta es: " + idiomas.FINAL);
                break;
            case 3:
                getData(); // Obtiene los datos de entrada
                OperacionAritmetica multiplicacion = new Multiplicacion(); // Crea una instancia de Multiplicacion
                resultado = multiplicacion.calcular(x, y); // Calcula la multiplicacion
                System.out.println("El resultado de la multiplicacion es: " + idiomas.FINAL);
                break;
            case 4:
                getData(); // Obtiene los datos de entrada
                OperacionAritmetica division = new Division(); // Crea una instancia de Division
                resultado = division.calcular(x, y); // Calcula la division
                System.out.println("El resultado de la division es: " + idiomas.FINAL);
                break;
            case 5:
                getData(); // Obtiene los datos de entrada
                OperacionAritmetica modulo = new Modulo(); // Crea una instancia de Modulo
                resultado = modulo.calcular(x, y); // Calcula el modulo
                System.out.println("El resultado del modulo es: " + idiomas.FINAL);
                break;
            case 6:
                getData(); // Obtiene los datos de entrada
                OperacionAritmetica potencia = new Potencia(); // Crea una instancia de Potencia
                resultado = potencia.calcular(x, y); // Calcula la potencia
                System.out.println("El resultado de la potencia es: " + idiomas.FINAL);
                break;
            case 7:
                getData(); // Obtiene los datos de entrada
                OperacionAritmetica logaritmo = new Logaritmo(); // Crea una instancia de Logaritmo
                resultado = logaritmo.calcular(x, y); // Calcula el logaritmo
                System.out.println("El resultado del logaritmo es: " + idiomas.FINAL);
                break;
            case 8:
                getData(); // Obtiene los datos de entrada
                OperacionAritmetica raiz = new Raiz(); // Crea una instancia de Raiz
                resultado = raiz.calcular(x, y); // Calcula la raiz
                System.out.println(idiomas.RESULTADO_UNO + operacion.getClass().getSimpleName() + idiomas.RESULTADO_DOS + resultado);
                break;
            default:
                System.out.println(idiomas.OPCION_INVALIDA + idiomas.FINAL);
                break;
        }
    }
}
