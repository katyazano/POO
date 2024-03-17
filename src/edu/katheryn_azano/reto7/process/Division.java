package edu.katheryn_azano.reto7.process;

// Clase Division que extiende de Resta
public class Division extends Resta {

    // Método para calcular la división
    @Override
    public double calcular(double x, double y) {
        // Se verifica si se está intentando dividir por cero
        if (y == 0) throw new ArithmeticException("División por cero.");

        int contador = 0;
        double residuo = Math.abs(x);

        // Se realiza la división mediante restas sucesivas
        while (residuo >= Math.abs(y)) {
            residuo = super.calcular(residuo, Math.abs(y));
            contador++;
        }

        // Se ajusta el resultado si los signos de los números son diferentes
        if ((x < 0 && y > 0) || (x > 0 && y < 0)) {
            contador = -contador;
        }

        return contador; // Se retorna el resultado de la división
    }
}
