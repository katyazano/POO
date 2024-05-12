package edu.katheryn_azano.evidencia3.data;

import edu.katheryn_azano.evidencia3.process.Persona;

public class PuntajesJugador {
    private String nombre;
    private String simbolo;
    private String puntaje;

    public PuntajesJugador(String nombre, String simbolo, String puntaje) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }
}
