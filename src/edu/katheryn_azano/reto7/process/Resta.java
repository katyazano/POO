package edu.katheryn_azano.reto7.process;

/**
 * Clase concreta para la resta
 */
public class Resta extends OperacionAritmetica {
    @Override
    public double calcular(double x, double y) {
        return x - y;
    }
}
