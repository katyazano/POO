package edu.katheryn_azano.reto2.process;

import java.util.Scanner;

public class procesos {
    public static void login(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el usuario");
        String usuario = scanner.next();
        System.out.println("Ingresa la contraseña");
        String password = scanner.next();
        String userCorrecto = "usuario1";
        String passwordCorrecto = "password123";

        if(!(usuario.equals(userCorrecto) && password.equals(passwordCorrecto))) {
            System.out.println("Usuario o contraseña incorrectos, intente de nuevo");
            login();
        }
    }
}
