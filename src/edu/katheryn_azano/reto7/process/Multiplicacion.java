package edu.katheryn_azano.reto7.process;

public class Multiplicacion extends Suma{
    @Override
    public double calcular(double x, double y){
        double resultado = 0;
        for (int i =0; i < Math.abs(y); i++){
            resultado = new Suma().calcular(resultado,x);
        }
        return y < 0 ? - resultado : resultado;
    }
}
