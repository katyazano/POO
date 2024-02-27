package edu.katheryn_azano.reto4.data;

/**
 * Clase que representa a un pasajero.
 */
public class Pasajero {
    // Declaración de variables
    private String nombre;
    private boolean esComprador;

    /**
     * Constructor de la clase Pasajero.
     * @param nombre El nombre del pasajero.
     * @param esComprador Indica si el pasajero es el comprador principal.
     */
    public Pasajero(String nombre, boolean esComprador) {
        this.nombre = nombre;
        this.esComprador = esComprador;
    }

    /**
     * Obtiene el nombre del pasajero.
     * @return El nombre del pasajero.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Indica si el pasajero es el comprador principal.
     * @return true si el pasajero es el comprador principal, false de lo contrario.
     */
    public boolean esComprador() {
        return esComprador;
    }
}