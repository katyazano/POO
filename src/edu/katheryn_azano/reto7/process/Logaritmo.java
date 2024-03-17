package edu.katheryn_azano.reto7.process;

public class Logaritmo extends OperacionAritmetica{
    @Override
    public double calcular(double base, double valor) {
        if (base <= 1 || valor <= 0) {
            throw new ArithmeticException("El logaritmo no está definido para base <= 1 o valor <= 0.");
        }
        Potencia potencia= new Potencia();

        double resultado = 0;
        double potenciaActual = 1;

        while (potenciaActual < valor) {
            resultado++;
            potenciaActual = potencia.calcular(base, resultado);
        }
        return resultado;
    }
}