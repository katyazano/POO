package edu.katheryn_azano.reto7.process;

// Clase Potencia que extiende de Multiplicacion
public class Potencia extends Multiplicacion {

    // Método para calcular la potencia
    @Override
    public double calcular(double base, double exponente) {
        // Se crea una instancia de la clase Division
        Division division = new Division();

        // Si el exponente es 0, el resultado es 1
        if (exponente == 0) {
            return 1;
        } else if (exponente < 0) { // Si el exponente es negativo, se convierte la base en fracción
            base = division.calcular(1, base);
            exponente = -exponente;
        }

        // Se calcula la potencia utilizando multiplicaciones sucesivas
        double resultado = base;
        for (int i = 1; i < exponente; i++) {
            resultado = super.calcular(resultado, base);
        }
        return resultado; // Se retorna el resultado de la potencia
    }
}
