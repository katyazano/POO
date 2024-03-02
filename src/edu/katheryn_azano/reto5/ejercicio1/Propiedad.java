package edu.katheryn_azano.reto5.ejercicio1;

public class Propiedad {

    private String direccion;
    private float coordenadas;
    private String estadoDeLaPropiedad; // renta o venta
    private String tipoDePropiedad; // departamento o casa
    private double precio;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(float coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getEstadoDeLaPropiedad() {
        return estadoDeLaPropiedad;
    }

    public void setEstadoDeLaPropiedad(String estadoDeLaPropiedad) {
        this.estadoDeLaPropiedad = estadoDeLaPropiedad;
    }

    public String getTipoDePropiedad() {
        return tipoDePropiedad;
    }

    public void setTipoDePropiedad(String tipoDePropiedad) {
        this.tipoDePropiedad = tipoDePropiedad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
