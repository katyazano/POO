package edu.katheryn_azano.evidencia3.process;

import edu.katheryn_azano.evidencia3.data.PuntajesJugador;
import edu.katheryn_azano.evidencia3.ui.Idiomas;

import java.util.*;

import static edu.katheryn_azano.evidencia3.process.Computadora.simbolos;

public class JuegoGato {

    private Tablero tablero;
    private Persona jugador1;
    private Persona jugador2;
    private Idiomas idioma;

    public JuegoGato(Idiomas idioma) {
        this.tablero = new Tablero();
        this.idioma = idioma;
        this.jugador1 = null;
        this.jugador2 = null;
    }

    /**
     * Metodo para generar el turno de manera aleatoria para el modo
     * Jugador vs Jugador
     */
    public static void generarTurnoPersona(Jugador jugador1, Jugador jugador2){
        Tablero tablero = new Tablero();
        Random random = new Random();
        boolean turnoJugador = random.nextBoolean();
        boolean inGame = true;
        while (inGame) {
            if (turnoJugador) {
                System.out.println(Idiomas.COMIENZA + " " + jugador1.getNombre() + " (" + jugador1.getSimbolo() + ").");
                inGame = jugador1.jugada(tablero);
                System.out.println(Idiomas.TERMINA_TURNO);
                turnoJugador = false;
            } else {
                System.out.println( Idiomas.COMIENZA + " " + jugador2.getNombre() + " (" + jugador2.getSimbolo() + ").");
                inGame = jugador2.jugada(tablero);
                System.out.println(Idiomas.TERMINA_TURNO);
                turnoJugador = true;
            }
        }
    }

    /**
     * Metodo para generar el turno de manera aleatoria para el modo
     * Jugador vs Computadora
     */
    public static void generarTurnoComputadora(Jugador persona){
        Tablero tablero = new Tablero();
        Jugador computadora = new Computadora(simbolos[new Random().nextInt(simbolos.length)]);
        Random random = new Random();
        boolean turnoJugador = random.nextBoolean();

        // Mostrar quién comienza primero
        if (turnoJugador) {
            System.out.println(Idiomas.COMIENZA + " " + persona.getNombre() + " (" + persona.getSimbolo() + ").");
        } else {
            System.out.println(Idiomas.COMIENZA + " " + computadora.getNombre() + " (" + computadora.getSimbolo() + ").");
        }

        while (true) {
            if (turnoJugador) {
                // Turno del jugador humano
                System.out.println(Idiomas.TURNO);
                if (!persona.jugada(tablero)) {
                    break; // El jugador ha terminado el juego
                }
            } else {
                // Turno de la computadora
                System.out.println(Idiomas.TURNO_COMPUTADORA);
                if (!computadora.jugada(tablero)) {
                    break; // La computadora ha terminado el juego
                }
            }

            // Mostrar el tablero después de cada jugada
            tablero.mostrarTablero();

            // Verificar si hay un ganador o si el tablero está lleno
            if (tablero.hayGanador(persona.getSimbolo())) {
                System.out.println(Idiomas.FELICITACION);
                break;
            } else if (tablero.hayGanador(computadora.getSimbolo())) {
                System.out.println(Idiomas.COMPUTADORA_GANADORA);
                break;
            } else if (tablero.estaLleno()) {
                System.out.println(Idiomas.EMPATE);
                break;
            }

            // Alternar el turno para la siguiente jugada
            turnoJugador = !turnoJugador;
        }

        // Mostrar el tablero final
        tablero.mostrarTablero();
    }

}