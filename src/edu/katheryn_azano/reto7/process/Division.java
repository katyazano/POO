
package edu.katheryn_azano.reto7.process;

public class Division extends Resta {
    @Override
    public double calcular(double x, double y) {
        if (y == 0) throw new ArithmeticException("División por cero.");
        int contador = 0;
        double residuo = Math.abs(x);
        while (residuo >= Math.abs(y)) {
            residuo = super.calcular(residuo, Math.abs(y));
            contador++;
        }
        if ((x < 0 && y > 0) || (x > 0 && y < 0)) {
            contador = - contador;
        }
        return contador;
    }
}
