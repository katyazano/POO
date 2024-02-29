package edu.katheryn_azano.reto5.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class PantallaListaPropiedades {
    // Atributos
    private Ubicacion ubicacionUsuario;
    private List<Propiedad> propiedadesCercanas;
    private Buscador buscador;

    // Constructor
    public PantallaListaPropiedades(Ubicacion ubicacionUsuario) {
        this.ubicacionUsuario = ubicacionUsuario;
        this.propiedadesCercanas = new ArrayList<>();
        this.buscador = new Buscador();
    }

    // Métodos
    public void mostrarListaPropiedades() {
        // Obtener las propiedades cercanas a la ubicación del usuario
        propiedadesCercanas = buscador.buscarPropiedadesCercanas(ubicacionUsuario);
    }


    // Getters and setters
    public Ubicacion getUbicacionUsuario() {
        return ubicacionUsuario;
    }

    public void setUbicacionUsuario(Ubicacion ubicacionUsuario) {
        this.ubicacionUsuario = ubicacionUsuario;
    }

    public List<Propiedad> getPropiedadesCercanas() {
        return propiedadesCercanas;
    }

    public void setPropiedadesCercanas(List<Propiedad> propiedadesCercanas) {
        this.propiedadesCercanas = propiedadesCercanas;
    }

    public Buscador getBuscador() {
        return buscador;
    }

    public void setBuscador(Buscador buscador) {
        this.buscador = buscador;
    }
}
