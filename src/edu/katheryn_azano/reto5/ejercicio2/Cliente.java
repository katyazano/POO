package edu.katheryn_azano.reto5.ejercicio2;

public class Cliente {

    private String nombre;
    private int edad;
    private String direccion;
    private int telefono;

    public Cliente(String nombre, int edad, String direccion, int telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void actualizarInformacion() {
        // TODO: Implementar este metodo
    }

}
