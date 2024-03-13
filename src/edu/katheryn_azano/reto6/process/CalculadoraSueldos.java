package edu.katheryn_azano.reto6.process;

import edu.katheryn_azano.reto6.data.Categoria;
import edu.katheryn_azano.reto6.data.Empleado;

import java.util.ArrayList;

public class CalculadoraSueldos {
    /**
     * Método para calcular el total de la nómina y generar un reporte final
     * */
    public static void calcularTotalSueldos(ArrayList<Empleado> empleados, int cantidadEmpleados) {
        double totalNomina = 0;
        double totalSueldoNormal = 0;
        double totalHorasExtras = 0;
        int[] totalPersonasHorasExtras = {0}; // Array para almacenar el valor mutable
        double totalHorasLaboradas = 0;

        //Por cada empleado ingresado en el ArrayList, hace todas estas sumas
        for (Empleado empleado : empleados) {
            int horasTrabajadas = empleado.getHorasTrabajadas();
            double horasExtras = empleado.getHorasExtrasTrabajadas();
            Categoria categoria = empleado.getCategoria();

            double sueldoNormal = horasTrabajadas * categoria.getSueldoBase();
            double pagoHorasExtras = horasExtras * categoria.getPagoPorHoraExtra();
            totalHorasLaboradas += horasTrabajadas + horasExtras;

            totalNomina += sueldoNormal + pagoHorasExtras;
            totalSueldoNormal += sueldoNormal;
            totalHorasExtras += pagoHorasExtras;

            //Si no hay horas extra, se suman a personas sin horas extra
            if (horasExtras > 0) {
                totalPersonasHorasExtras[0]++;
            }
        }

        int totalPersonasSinHorasExtras = empleados.size() - totalPersonasHorasExtras[0];

        mostrarReporteFinal(totalNomina, totalSueldoNormal, totalHorasExtras, totalPersonasHorasExtras[0], totalPersonasSinHorasExtras, totalHorasLaboradas);
    }

    /**
     * Método para mostrar el reporte final
     * */
    public static void mostrarReporteFinal(double totalNomina, double totalSueldoNormal, double totalHorasExtras, int totalPersonasHorasExtras, int totalPersonasSinHorasExtras, double totalHorasLaboradas) {
        System.out.println("\nTotal de la nómina: " + totalNomina);
        System.out.println("Total de sueldos normales: " + totalSueldoNormal);
        System.out.println("Total de horas extras pagadas: " + totalHorasExtras);
        System.out.println("Total de horas laboradas: " + totalHorasLaboradas);
        System.out.println("Total de personas con horas extras: " + totalPersonasHorasExtras);
        System.out.println("Total de personas sin horas extras: " + totalPersonasSinHorasExtras);
    }
}