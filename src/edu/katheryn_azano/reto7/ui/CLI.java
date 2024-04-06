package edu.katheryn_azano.reto7.ui;

import edu.katheryn_azano.reto7.process.*;

import java.util.Scanner;

public class CLI {
    private static Scanner scanner = new Scanner(System.in);
    private static double x = 0, y = 0;
    private static Idiomas idiomas = new Espanol();

    // Método para mostrar el menú de selección de idioma
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

    // Método para imprimir el resultado de la operación aritmética
    public static void printResult(OperacionAritmetica operacion, double x, double y ){
        System.out.println(idiomas.RESULTADO_UNO + operacion.getClass().getSimpleName() + idiomas.RESULTADO_DOS
                + operacion.calcular(x,y));
    }

    // Método público para lanzar la aplicación de la calculadora
    public static void launchApp() {
        showMenu();
        int choice = scanner.nextInt();
        OperacionAritmetica operacion = null;
        switch (choice) {
            case 1:
                getData(); // Obtiene los datos de entrada
                operacion = new Suma(); // Crea una instancia de Suma
                printResult(operacion, x, y); // Calcula la suma
                break;
            case 2:
                getData(); // Obtiene los datos de entrada
                operacion = new Resta(); // Crea una instancia de Resta
                printResult(operacion, x, y); // Calcula la resta
                break;
            case 3:
                getData(); // Obtiene los datos de entrada
                operacion = new Multiplicacion(); // Crea una instancia de Multiplicacion
                printResult(operacion, x, y); // Calcula la multiplicacion
                break;
            case 4:
                getData(); // Obtiene los datos de entrada
                operacion = new Division(); // Crea una instancia de Division
                printResult(operacion, x, y); // Calcula la division
                break;
            case 5:
                getData(); // Obtiene los datos de entrada
                operacion = new Modulo(); // Crea una instancia de Modulo
                printResult(operacion, x, y); // Calcula el modulo
                break;
            case 6:
                getData(); // Obtiene los datos de entrada
                operacion = new Potencia(); // Crea una instancia de Potencia
                printResult(operacion, x, y); // Calcula la potencia
                break;
            case 7:
                getData(); // Obtiene los datos de entrada
                operacion = new Logaritmo(); // Crea una instancia de Logaritmo
                printResult(operacion, x, y); // Calcula el logaritmo
                break;
            case 8:
                getData(); // Obtiene los datos de entrada
                operacion = new Raiz(); // Crea una instancia de Raiz
                printResult(operacion, x, y); // Calcula la raiz
                break;
            default:
                System.out.println(idiomas.OPCION_INVALIDA + idiomas.FINAL);
                break;
        }
    }
}
