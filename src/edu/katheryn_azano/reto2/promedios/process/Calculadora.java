package edu.katheryn_azano.reto2.promedios.process;

public class Calculadora {
    /**
     * Este metodo tiene como función calcular el promedio con el array que se asignó
     * @param calificaciones calificación que ingresará el usuario
     * @return promedio de las calificaciones
     */
    public static double calculadoraPromedios(double[] calificaciones){
        double sumaCalificaciones = 0;

        //Suma de todas las calificaciones del array
        for (double calificacion : calificaciones){
            sumaCalificaciones += calificacion;
        }

        //Calcula y devuelve el promedio
        return sumaCalificaciones / calificaciones.length;
    }
}
