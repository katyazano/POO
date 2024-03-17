package edu.katheryn_azano.reto7.process;

public class Raiz extends OperacionAritmetica{
    private static final double ERROR_TOLERADO = 0.0001;

    @Override
    public double calcular(double x, double y) {
        if (x < 0) throw new IllegalArgumentException("Raíz cuadrada de un número negativo no está definida.");

        Division division = new Division();

        double r = x;
        double rAnterior = 0;

        if (x != 1) {
            r = division.calcular(x, 2);
        }

        while (Math.abs(r - rAnterior) > ERROR_TOLERADO) {
            rAnterior = r;
            double temp = division.calcular(x, r);
            temp = r + temp;
            r = division.calcular(temp, 2);
        }
        return r;
    }
}
