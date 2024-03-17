package edu.katheryn_azano.reto7.process;

public class Potencia extends Multiplicacion{
    @Override
    public double calcular(double base, double exponente) {
        Division division = new Division();

        if (exponente == 0) {
            return 1;
        } else if (exponente < 0) {
            base = division.calcular(1,base);
            exponente = -exponente;
        }

        double resultado = base;
        for (int i = 1; i < exponente; i++) {
            resultado = super.calcular(resultado, base);
        }
        return resultado;
    }
}
