package edu.katheryn_azano.reto7.process;

public class Modulo extends Resta{
    @Override
    public double calcular(double x, double y) {
        if (y == 0) throw new ArithmeticException("Operación módulo por cero no permitida.");
        double residuo = Math.abs(x);
        while (residuo >= Math.abs(y)) {
            residuo = super.calcular(residuo, Math.abs(y));
        }
        return residuo;
    }
}
