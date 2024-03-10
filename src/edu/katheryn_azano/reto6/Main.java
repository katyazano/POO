package edu.katheryn_azano.reto6;

import edu.katheryn_azano.reto6.data.Categoria;
import edu.katheryn_azano.reto6.data.Empleado;
import edu.katheryn_azano.reto6.ui.CLI;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        Categoria empleadoVentas = new Categoria("Empleado Ventas", "EV", 100.00, 50.00);
        Categoria administrador = new Categoria("Administrador", "ADM", 180.00, 100.00);
        Categoria gerente = new Categoria("Gerente", "GER", 250.00, 150.00);
        CLI.capturarEmpleado(empleados, empleadoVentas, administrador, gerente);
    }
}
