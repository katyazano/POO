package edu.katheryn_azano.reto5.ejercicio1;

public class Ubicacion {

    private float latitud;
    private float longitud;

    public Ubicacion(float latitud, float longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public float getLatitud() {
        return latitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }
}
