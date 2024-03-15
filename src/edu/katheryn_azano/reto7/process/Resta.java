package edu.katheryn_azano.reto7.process;

/**
 * Clase concreta para la resta
 */
class Resta extends OperacionAritmetica {
    @Override
    public double operar(double[] numeros) {
        double resultado = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            resultado -= numeros[i];
        }
        return resultado;
    }
}
