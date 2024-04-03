package edu.katheryn_azano.reto7.process;

// Clase Raiz que extiende de OperacionAritmetica
public class Raiz extends OperacionAritmetica {

    // Tolerancia para el cálculo de la raíz
    private static final double ERROR_TOLERADO = 0.0001;

    // Método para calcular la raíz
    @Override
    public double calcular(double x, double y) {
        // Verifica si el número es negativo
        if (x < 0) throw new IllegalArgumentException("Raíz cuadrada de un número negativo no está definida.");

        // Se crea una instancia de la clase Division
        Division division = new Division();

        // Variables para almacenar el resultado de la raíz y su valor anterior
        double r = x;
        double rAnterior = 0;

        // Si x no es igual a 1, se calcula la raíz inicial
        if (x != 1) {
            r = division.calcular(x, 2);
        }

        // Ciclo para refinar el cálculo de la raíz
        while (Math.abs(r - rAnterior) > ERROR_TOLERADO) {
            rAnterior = r;
            double temp = division.calcular(x, r);
            temp = r + temp;
            r = division.calcular(temp, 2);
        }
        return r; // Se retorna el resultado de la raíz
    }
}
