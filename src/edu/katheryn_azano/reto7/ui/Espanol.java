package edu.katheryn_azano.reto7.ui;

public class Espanol extends Idiomas {

    /**
     * Constructor para declarar al idioma español
     */
    public Espanol() {
        // Menú de la calculadora
        MENU = "---Calculadora---" +
                "\nElige una opción: \n1.Suma\n2.Resta\n3.Multiplicación\n4.División\n5.Modulo\n6.Potencia\n7.Logaritmo\n8.Raiz" +
                "\nIngrese el numero de la opción deseada:";

        // Mensajes para solicitar los números de entrada
        INGRESAR_PRIMERNUMERO = "Ingrese el primer número:";
        INGRESAR_SEGUNDONUMERO = "Ingrese el segundo número:";
        INGRESAR_DIVIDIENDO = "Ingrese el dividendo:";
        INGRESAR_DIVISOR = "Ingrese el divisor";
        INGRESAR_POTENCIA = "Ingrese a que potencia lo desea elevar:";

        // Mensajes finales
        FINAL = "\nPrograma Terminado :)";
        OPCION_INVALIDA = "Opción no válida";
        RESULTADO_UNO = "El resultado de la ";
        RESULTADO_DOS = " es: ";
    }
}
