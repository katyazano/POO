package edu.katheryn_azano.reto4;

import edu.katheryn_azano.reto4.ui.CLI;

public class Main {
    /**
     * Se inicia la aplicación CLI.
     */
    public static void main(String[] args){
        try{
            CLI.launchApp();
        }  catch (Exception e){ //si el usuario ingresa una respuesta que no se puede procesar les arroja "Error inesperado"
            System.out.println("Error inesperado"+e);
        }
    }
}