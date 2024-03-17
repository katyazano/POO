package edu.katheryn_azano.reto7.process;

// Clase Multiplicacion que extiende de Suma
public class Multiplicacion extends Suma {

    // Método para calcular la multiplicación
    @Override
    public double calcular(double x, double y) {
        double resultado = 0;

        // Se realiza la multiplicación mediante sumas sucesivas
        for (int i = 0; i < Math.abs(y); i++) {
            resultado = new Suma().calcular(resultado, x);
        }

        // Se verifica si el resultado debe ser negativo
        return y < 0 ? -resultado : resultado;
    }
}
