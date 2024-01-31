package edu.katheryn_azano.reto2;

import edu.katheryn_azano.reto2.ui.CLI;

public class Main {
    public static void main(String[] args) {
        try{
            CLI.showMenu();
        } catch (Exception e){ //si el usuario ingresa una respuesta que no se puede procesar les arroja "Error inesperado"
            System.out.println("Error inesperado"+e);
        }
    }
}
