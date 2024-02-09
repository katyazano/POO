package edu.katheryn_azano.reto3.numeros;

import edu.katheryn_azano.reto3.numeros.ui.CLI;

public class Main {
    public static void main(String[] args){
        CLI ob = new CLI();
        try{
            ob.launchApp();
        }  catch (Exception e){ //si el usuario ingresa una respuesta que no se puede procesar les arroja "Error inesperado"
            System.out.println("Error inesperado"+e);
        }
    }
}
