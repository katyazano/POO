package edu.katheryn_azano.reto7.data;

public class Resultados {
    private double resultado;
    private String operacion;

    public Resultados(double resultado, String operacion) {
        this.resultado = resultado;
        this.operacion = operacion;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
}
