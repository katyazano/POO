package edu.katheryn_azano.evidencia3.process;

import edu.katheryn_azano.evidencia3.data.PuntajesJugador;
import edu.katheryn_azano.evidencia3.ui.Idiomas;

import java.util.Scanner;

public class Persona extends Jugador {

    public Persona(String nombre, String simbolo) {
        super(nombre, simbolo);
    }

    /**
     * Metodo extendido de la clase Jugador, para las jugadas de los dos
     * jugadores (P vs P) o el jugador (P vs Comp) en cada partida
     * @param tablero para las jugadas
     */
    public boolean jugada(Tablero tablero){
        // Implementar la lógica de jugada de la persona
        Scanner scanner = new Scanner(System.in);

        tablero.mostrarTablero();
        System.out.println(Idiomas.SIGUIENTE_TURNO + this.getNombre());
        System.out.println(Idiomas.FILA);
        int fila = scanner.nextInt();
        System.out.println(Idiomas.COLUMNA);
        int columna = scanner.nextInt();

        //Para ajustar la columna y la fila ingresada de 1-3 a 0-2
        fila--;
        columna--;

        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3){
            if(tablero.marcarCasilla(fila,columna,this.getSimbolo())){
                if (tablero.hayGanador(this.getSimbolo())){
                    tablero.mostrarTablero();
                    sumarVictoria();
                    System.out.println(Idiomas.FELICITACION + this.getNombre());
                    return false;
                }else if (tablero.estaLleno()){
                    tablero.mostrarTablero();
                    System.out.println(Idiomas.EMPATE);
                    return false;
                }
            } else {
                System.out.println(Idiomas.ERROR_POSICION);
            }
        }else {
            System.out.println(Idiomas.ERROR_MOVIMIENTO);
        }
        return true;
    }
}