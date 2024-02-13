package edu.katheryn_azano.reto3.numeros.process;

import java.util.Arrays;
import java.util.Random;

public class CalculadoraPares {
    /**
     * Genera una matriz aleatoria con valores entre 1 y 100.
     * @param fila El número de filas de la matriz.
     * @param columna El número de columnas de la matriz.
     * @return La matriz generada aleatoriamente.
     */
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

    /**
     * Calcula la cantidad de números pares e impares en cada fila y columna de la matriz.
     * @param tabla La matriz en la que se realizará el conteo.
     */
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

    /**
     * Calcula la suma total de los valores en la matriz.
     * @param tabla La matriz de la que se calculará la suma.
     * @return La suma total de los valores en la matriz.
     */
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
