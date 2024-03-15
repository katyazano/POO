package edu.katheryn_azano.reto7.process;

/**
 * Clase concreta para la suma
 */
class Suma extends OperacionAritmetica {
    @Override
    public double operar(double[] numeros) {
        double resultado = 0;
        for (double numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }
}

