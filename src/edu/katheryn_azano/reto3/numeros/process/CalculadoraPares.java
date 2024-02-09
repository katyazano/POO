package edu.katheryn_azano.reto3.numeros.process;

import edu.katheryn_azano.reto3.numeros.ui.CLI;

import java.util.Arrays;
import java.util.Random;

public class CalculadoraPares {
    public int[][] array(int fila, int columna){
        Random random = new Random();
        int numeroAleatorio = 0;
        int [][] tabla = new int[fila][columna];

        for (int i=0; i<(tabla.length); i++) {
            for (int j=0;j<tabla[i].length;j++) {
                numeroAleatorio = random.nextInt(101) + 1;
                tabla[i][j] = numeroAleatorio;
            }
        }
        for (int i=0; i<tabla.length; i++){
            System.out.println(Arrays.toString(tabla[i]));
        }return tabla;
    }

    public void paresImpares(int[][] tabla){
        for (int fila=0; fila<(tabla.length); fila++) {
            int pares = 0;
            int impares = 0;
            for (int columna=0;columna<tabla[fila].length;columna++) {
                if (tabla[fila][columna] % 2 == 0){
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println("Cantidad de pares: " + pares + ", impares: " + impares + " en la fila: " + (fila + 1));
        }

        int columnas = tabla[0].length;
        for (int j = 0; j < columnas; j++) {
            int pares = 0;
            int impares = 0;
            for (int i = 0; i < tabla.length; i++) {
                if (tabla[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println("Cantidad de pares: " + pares + ", impares: " + impares + " en la columna " + (j + 1));
        }
    }

    public int suma(int[][] tabla){
        int total = 0;
        for (int j = 0; j < tabla.length; j++) {
            for (int i = 0; i < tabla.length; i++) {
                total += tabla[j][i];
            }
        }
        return total;
    }
}
