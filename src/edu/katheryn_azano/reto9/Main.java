package edu.katheryn_azano.reto9;

import edu.katheryn_azano.reto9.ui.CLI;

public class Main {
    public static void main(String[] args) {
        try {
            // Lanza la aplicación desde la interfaz de línea de comandos
            CLI.launchApp();
        } catch (Exception e) {
            // Captura cualquier excepción y muestra un mensaje de error genérico
            System.out.println("Ocurrió un error inesperado");
        }
    }
}
