package edu.katheryn_azano.evidencia3.process;

import edu.katheryn_azano.evidencia3.data.PuntajesJugador;
import edu.katheryn_azano.evidencia3.ui.Idiomas;

import java.util.*;

public class JuegoGato {

    private Tablero tablero;
    private Persona jugador1;
    private Persona jugador2;
    private Idiomas idioma;
    private List<PuntajesJugador> salonFama;

    public JuegoGato(Idiomas idioma) {
        this.tablero = new Tablero();
        this.idioma = idioma;
        this.salonFama = new ArrayList<>();
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
                System.out.println("Comienza " + jugador1.getNombre() + " (" + jugador1.getSimbolo() + ").");
                inGame = jugador1.jugada(tablero);
                System.out.println("termina turno");
                turnoJugador = false;
            } else {
                System.out.println("Comienza " + jugador2.getNombre() + " (" + jugador2.getSimbolo() + ").");
                inGame = jugador2.jugada(tablero);
                System.out.println("termina turno");
                turnoJugador = true;
            }
        }
    }

    /**
     * Metodo para generar el turno de manera aleatoria para el modo
     * Jugador vs Computadora
     */
    public static void generarTurnoComputadora(String nombrejugador){
        Tablero tablero = new Tablero();
        Persona jugador = new Persona(nombrejugador,"X");
        Persona computadora = new Persona("Computadora","0");
        Random random = new Random();
        boolean turnoJugador = random.nextBoolean();

        if (turnoJugador) {
            System.out.println("Comienza " + jugador.getNombre() + " (" + jugador.getSimbolo() + ").");
            jugador.jugada(tablero);
        } else {
            System.out.println("Comienza " + computadora.getNombre() + " (" + computadora.getSimbolo() + ").");
            computadora.jugada(tablero);
        }
    }

}