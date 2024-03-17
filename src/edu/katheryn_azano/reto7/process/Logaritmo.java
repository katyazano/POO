package edu.katheryn_azano.reto7.process;

// Clase Logaritmo que extiende de OperacionAritmetica
public class Logaritmo extends OperacionAritmetica {

    // Método para calcular el logaritmo
    @Override
    public double calcular(double base, double valor) {
        // Se verifica si el logaritmo está definido para los valores dados
        if (base <= 1 || valor <= 0) {
            throw new ArithmeticException("El logaritmo no está definido para base <= 1 o valor <= 0.");
        }

        // Se crea una instancia de la clase Potencia
        Potencia potencia = new Potencia();

        double resultado = 0;
        double potenciaActual = 1;

        // Se calcula el logaritmo mediante potencias sucesivas
        while (potenciaActual < valor) {
            resultado++;
            potenciaActual = potencia.calcular(base, resultado);
        }

        return resultado; // Se retorna el resultado del logaritmo
    }
}
