package edu.katheryn_azano.reto7.data;

import java.util.List;

public class DatosEntrada {
    private List<Double> numeros;
    private int operacion;

    public DatosEntrada(List<Double> numeros, int operacion) {
        this.numeros = numeros;
        this.operacion = operacion;
    }

    public List<Double> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Double> numeros) {
        this.numeros = numeros;
    }

    public int getOperacion() {
        return operacion;
    }

    public void setOperacion(int operacion) {
        this.operacion = operacion;
    }
}
