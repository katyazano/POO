package edu.katheryn_azano.reto1.ui;

import edu.katheryn_azano.reto1.process.Calculadora;

import java.util.Scanner;

public class CLI {
    /**
     * en este método se declara imc que es la variable en la que se guarda el Indice de Masa Corporal
     */
    public static double imc;

    /**
     * Este metodo muestra el menú principal para el usuario e inicia el metodo de launchApp
     */
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        //Menu
        System.out.println("Elige alguna de estas opciones:");
        System.out.println("A. Cálculo de masa corporal (índice de masa corporal) \nB. Cálculo de masa corporal magra \nC. Cálculo de metabolismo basal (gasto energético basal) \nZ.Salir");
        launchApp();
    }

    /**
     * Este metodo inicia la aplicación según se indica en el menú
     */
    public static void launchApp(){
        Scanner scanner = new Scanner(System.in);

        //Lee la respuesta del usuario
        System.out.println("Ingrese la opción deseada: ");
        char eleccion = scanner.next().charAt(0); //Este comando es para que el programa solo lea el primer caracter

        //Procesar la respuesta para las 3 situaciones
        if (eleccion == 'A' || eleccion == 'a'){
            System.out.println("Ingrese su estatura en cm: ");
            double estatura = scanner.nextDouble();
            System.out.println("Ingrese su peso en kg: ");
            double peso = scanner.nextDouble();

            imc = Calculadora.calcularIndiceMasaCorporal(estatura,peso);
            Calculadora.interpretacionIMC();
            System.out.println("Su imc es de: "+imc);

        } else if (eleccion == 'B' || eleccion == 'b') {
            System.out.println("Ingrese su estatura en cm: ");
            double estatura = scanner.nextDouble();
            System.out.println("Ingrese su peso en kg: ");
            double peso = scanner.nextDouble();
            System.out.println("Ingrese su sexo: 1 para mujer o 2 para hombre ");
            int sexo = scanner.nextInt();

            //utilizo un while para evitar un error si es que el usuario ingresa una respuesta erronea
            while (sexo != 1 && sexo != 2){
                System.out.println("Ingrese una respuesta válida");
                System.out.println("Ingrese su sexo: 1 para mujer o 2 para hombre ");
                sexo = scanner.nextInt();
            }

            System.out.println("Su masa corporal magra es: "+ Calculadora.calcularMasaMagra(estatura,peso,sexo));

        } else if (eleccion == 'C' || eleccion == 'c') {
            System.out.println("Ingrese su estatura en cm: ");
            double estatura = scanner.nextDouble();
            System.out.println("Ingrese su peso en kg: ");
            double peso = scanner.nextDouble();
            System.out.println("Ingrese su edad en años: ");
            double edad = scanner.nextDouble();
            System.out.println("Ingrese su sexo: 1 para mujer o 2 para hombre ");
            int sexo = scanner.nextInt();

            while (sexo != 1 && sexo != 2){
                System.out.println("Ingrese una respuesta válida");
                System.out.println("Ingrese su sexo: 1 para mujer o 2 para hombre ");
                sexo = scanner.nextInt();
            }
            System.out.println("Su metabolismo basal es de: "+ Calculadora.calcularMetabolismoBasal(estatura,peso,edad,sexo));
        } else if (eleccion == 'Z' || eleccion == 'z') {
            System.exit(0);
        }
        //Para no terminar el programa despliego una opción de volver al menú
        System.out.println("Si deseas volver al menu escribe: 1 \nSi deseas terminar el programa escribe: 0");
        int back = scanner.nextInt();
        if (back == 1){
            showMenu();
        }
    }
}


