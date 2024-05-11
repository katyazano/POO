package edu.katheryn_azano.evidencia3.process;

import edu.katheryn_azano.evidencia3.ui.Idiomas;

import java.util.Scanner;

import static edu.katheryn_azano.evidencia3.process.JuegoGato.simbolos;

public abstract class Jugador {
    private String nombre;
    private String simbolo;
    private int victorias;

    public Jugador(String nombre, String simbolo) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.victorias = 0;
    }

    private void elegirSimbolo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Idiomas.SELECCION_SIMBOLO);
        for (int i = 0; i < simbolos.length; i++) {
            System.out.println((i + 1) + ". " + simbolos[i]);
        }
        int opcion = scanner.nextInt();
        if (opcion >= 1 && opcion <= simbolos.length) {
            this.simbolo = simbolos[opcion - 1];
        } else {
            System.out.println(Idiomas.ERROR_SIMBOLO);
            this.simbolo = simbolos[0];
        }
        System.out.println(Idiomas.CONFIRMAR_SIMBOLO + this.simbolo);
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void sumarVictoria() {
        this.victorias++;
    }

    public String getVictorias() {
        return String.valueOf(victorias);
    }

    public boolean jugada(Tablero tablero){
        return true;
    }

    @Override
    public String toString() {
        return "PuntajesJugador " +
                "nombre:'" + nombre + '\'' +
                ",simbolo:'" + simbolo + '\'' +
                ",puntaje:" + victorias ;
    }
}
