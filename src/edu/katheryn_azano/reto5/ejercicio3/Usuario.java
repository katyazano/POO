package edu.katheryn_azano.reto5.ejercicio3;

public class Usuario {

    private String nombre;
    private String contraseña;
    private String dirección;
    private String metodoPago;

    public Usuario(String nombre, String contraseña, String dirección, String metodoPago) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.dirección = dirección;
        this.metodoPago = metodoPago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void iniciarSesion() {
        // TODO: Implementar la lógica de inicio de sesión
    }

    public void actualizarPerfil() {
        // TODO: Implementar la lógica de actualización de perfil
    }
}
