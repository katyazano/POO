package edu.katheryn_azano.evidencia3.data;

public class PuntajesJugador {
    private String nombre;
    private String simbolo;
    private int puntaje;

    public PuntajesJugador(String nombre, String simbolo, int puntaje) {
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

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "PuntajesJugador" +
                "nombre:'" + nombre + '\'' +
                ",simbolo:'" + simbolo + '\'' +
                ",puntaje:" + puntaje ;
    }
}
