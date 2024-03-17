package edu.katheryn_azano.reto7.process;

// Clase Modulo que extiende de Resta
public class Modulo extends Resta {

    // Método para calcular el módulo
    @Override
    public double calcular(double x, double y) {
        // Se verifica si se está intentando hacer módulo por cero
        if (y == 0) throw new ArithmeticException("Operación módulo por cero no permitida.");

        double residuo = Math.abs(x);

        // Se realiza la operación módulo mediante restas sucesivas
        while (residuo >= Math.abs(y)) {
            residuo = super.calcular(residuo, Math.abs(y));
        }

        return residuo; // Se retorna el resultado del módulo
    }
}
