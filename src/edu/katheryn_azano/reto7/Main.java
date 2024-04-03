package edu.katheryn_azano.reto7;

import edu.katheryn_azano.reto7.ui.CLI;

public class Main {
    public static void main(String[] args) {
        try {
            CLI.launchApp();
        }catch (Exception e){
            System.out.println("Ocurrrió un error inesperado");
        }
    }
}
