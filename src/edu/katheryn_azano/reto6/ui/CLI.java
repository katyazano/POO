package edu.katheryn_azano.reto6.ui;

import edu.katheryn_azano.reto6.data.Categoria;
import edu.katheryn_azano.reto6.data.Empleado;
import edu.katheryn_azano.reto6.process.CalculadoraSueldos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CLI {
    private static Scanner scanner = new Scanner(System.in);

    private static int showMenu(){
        System.out.println("----Registro de Empleados----");
        System.out.println("Ingrese la cantidad de empleados a capturar: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static void capturarEmpleado(ArrayList<Empleado> empleados, Categoria empleadoVentas, Categoria administrador, Categoria gerente) {
        int cantidadEmpleados = showMenu();

        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("Empleado #" + (i + 1));
            System.out.print("Ingrese el nombre del empleado: ");
            String nombre = scanner.next();
            System.out.print("Ingrese las horas trabajadas: ");
            int horasTrabajadas = scanner.nextInt();
            System.out.print("Ingrese las horas extras trabajadas: ");
            int horasExtra = scanner.nextInt();
            System.out.print("Ingrese el teléfono: ");
            String telefono = scanner.next();
            System.out.print("Ingrese la fecha de nacimiento (DD/MM/AAAA): ");
            String fechaNacimiento = scanner.next();

            System.out.println("Seleccione la categoría para el empleado:");
            System.out.println("1. Empleado ventas \n2. Administrador \n3. Gerente");
            int opcionCategoria = scanner.nextInt();
            Categoria categoria;
            switch (opcionCategoria) {
                case 1:
                    categoria = empleadoVentas;
                    break;
                case 2:
                    categoria = administrador;
                    break;
                case 3:
                    categoria = gerente;
                    break;
                default:
                    System.out.println("Opción inválida. Se asignará la categoría 'Empleado ventas' por defecto.");
                    categoria = empleadoVentas;
                    break;
            } empleados.add(new Empleado(nombre, horasTrabajadas, horasExtra, telefono, fechaNacimiento, categoria));
        }
        mostrarEmpleados(empleados, empleadoVentas, administrador, gerente,cantidadEmpleados);
    }

    public static void mostrarEmpleados(ArrayList<Empleado> empleados, Categoria empleadoVentas, Categoria administrador, Categoria gerente, int cantidadEmpleados) {
        System.out.println("\nDetalles de empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
        }
        CalculadoraSueldos.calcularTotalSueldos(empleados, cantidadEmpleados);
    }
}
