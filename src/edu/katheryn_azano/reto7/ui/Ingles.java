package edu.katheryn_azano.reto7.ui;

public class Ingles extends Idiomas{

    /**
     * Constructor para declarar al idioma inglés
     */
    public Ingles(){
        // Menú de la calculadora
        MENU = "---Calculator---"+
                "\nChoose an option:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulus" +
                "\n6.Exponentiation\n7.Logarithm\n8.Root"+
                "\nEnter the number of the desired option:";

        // Mensajes para solicitar los números de entrada
        INGRESAR_PRIMERNUMERO = "Enter the first number: " ;
        INGRESAR_SEGUNDONUMERO = "Enter the second number: ";
        INGRESAR_DIVISOR = "Enter the dividend: ";
        INGRESAR_DIVIDIENDO = "Enter the divisor: ";
        INGRESAR_POTENCIA = "Enter the power to which you want to raise it: ";

        // Mensajes finales
        FINAL = "\nFinished Program :)";
        OPCION_INVALIDA = "Invalid option";
        RESULTADO_UNO = "The result of  ";
        RESULTADO_DOS = " is: ";
    }
}
