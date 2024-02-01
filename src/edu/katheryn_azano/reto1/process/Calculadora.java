package edu.katheryn_azano.reto1.process;

import edu.katheryn_azano.reto1.ui.CLI;

/**
 * Esta clase sirve para calcular el Indice de Masa Corporal incluye los metodos:
 * indice de masa corporal
 * casa corporal magra
 * metabolismo basal o gasto energético basal
 **/
public class Calculadora {

    /**
     * este metodo sirve para calcular el indice de masa corporal de una persona con base en su peso y estatura
     * @param estatura estatura del usuario en centimetros
     * @param peso peso del usuario en kilogramos
     * @return indice de masa corporal
     */
    public static double calcularIndiceMasaCorporal(double estatura, double peso){
        return peso/Math.pow((estatura/100),2);
    }

    /**
     * Este metodo sirve para interpretar el indice de masa corporal del usuario e indicar la condición del paciente
     */
    public static void interpretacionIMC(){
        if(CLI.imc <= 18.5){
            System.out.println("Su peso está por debajo de lo normal");
        } else if (CLI.imc <= 24.99) {
            System.out.println("Su peso está dentro de lo normal");
        } else if (CLI.imc <= 29.99) {
            System.out.println("Su Indice de Masa Corporal se encuentra en: Sobrepeso");
        } else if (CLI.imc <= 34.99) {
            System.out.println("Su Indice de Masa Corporal se encuentra en: Obesidad leve");
        } else if (CLI.imc <= 39.99) {
            System.out.println("Su Indice de Masa Corporal se encuentra en: Obesidad media");
        } else {
            System.out.println("Su Indice de Masa Corporal se encuentra en: Obesidad mórbida");
        }
    }

    /**
     * Metodo para calcular la masa corporal magra del paciente
     * @param estatura estatura del usuario en centimetros
     * @param peso peso del usuario en kilogramos
     * @param sexo es el género del paciente, se recibe como 1 para mujer y 2 para hombre
     * @return respuesta 1 es la masa magra para mujer
     * @return respuesta2 es la masa magra para hombre
     */
    public static double calcularMasaMagra(double estatura, double peso, int sexo){
        double respuesta1 = (1.07 * peso) - 148 * Math.pow(peso,2) / Math.pow(estatura,2);
        double respuesta2 = (1.10 * peso) - 128 * Math.pow(peso,2) / Math.pow(estatura,2);

        if (sexo == 1){
            return respuesta1;
        } else {
            return respuesta2;
        }
    }

    /**
     * Metodo para calcular el metabolismo basal del paciente
     * @param estatura estatura del usuario en centimetros
     * @param peso peso del usuario en kilogramos
     * @param edad edad del usuario en años
     * @param sexo género del usuario, se recibe como 1 para mujer y 2 para hombre
     * @return respuesta 1 es el metabolismo basal para mujer
     * @return respuesta2 es el metabolismo basal para hombre
     */
    public static double calcularMetabolismoBasal(double estatura, double peso, double edad, int sexo){
        double respuesta1 = 655.1 + (9.563 * peso) + (1.85 * estatura) - (4.676 * edad);
        double respuesta2 = 66.5 + (13.75 * peso) + (5.003 * estatura) - (6.775 * edad);

        if (sexo == 1){
            return respuesta1;
        } else {
            return respuesta2;
        }
    }

}