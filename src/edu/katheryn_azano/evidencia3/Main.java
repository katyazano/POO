package edu.katheryn_azano.evidencia3;

import edu.katheryn_azano.evidencia3.process.JuegoGato;
import edu.katheryn_azano.evidencia3.ui.CLI;

import static edu.katheryn_azano.evidencia3.ui.CLI.launchApp;

public class Main {
    public static void main(String[] args) {
        try{
            launchApp();
        } catch (Exception e){ //si el usuario ingresa una respuesta que no se puede procesar les arroja "Error inesperado"
            System.out.println("Error inesperado"+e);
        }
    }
}
