package edu.katheryn_azano.evidencia3.process;

public abstract class Jugador {
    private String nombre;
    private String simbolo;
    private int victorias;

    public Jugador(String nombre, String simbolo) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.victorias = 0;
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

    public int getVictorias() {
        return victorias;
    }

    public void sumarVictoria() {
        this.victorias++;
    }

    public boolean jugada(Tablero tablero){
        return true;
    }
}
