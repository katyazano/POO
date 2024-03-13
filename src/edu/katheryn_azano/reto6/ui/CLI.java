package edu.katheryn_azano.reto6.ui;

import edu.katheryn_azano.reto6.data.Categoria;
import edu.katheryn_azano.reto6.data.Empleado;
import edu.katheryn_azano.reto6.process.CalculadoraSueldos;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

public class CLI {
    private static Scanner scanner = new Scanner(System.in);

    // Método para mostrar el menú y obtener la cantidad de empleados a capturar
    private static int showMenu(){
        System.out.println("----Registro de Empleados----");
        System.out.println("Ingrese la cantidad de empleados a capturar: ");
        return Integer.parseInt(scanner.nextLine());
    }

    // Método para capturar los datos de un empleado y agregarlo a la lista de empleados
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
            System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
            String edad = scanner.next();

            // Convertir la cadena a LocalDate
            LocalDate fecha_nacimiento = LocalDate.parse(edad);

            // Calcular la edad
            LocalDate fechaActual = LocalDate.now();
            edad = String.valueOf(Period.between(fecha_nacimiento, fechaActual).getYears());

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
            }
            // Agregar el empleado a la lista de empleados
            empleados.add(new Empleado(nombre, horasTrabajadas, horasExtra, telefono, edad, categoria));
        }
        // Mostrar los detalles de los empleados y calcular la nómina total
        mostrarEmpleados(empleados, empleadoVentas, administrador, gerente, cantidadEmpleados);
    }

    // Método para mostrar los detalles de los empleados
    public static void mostrarEmpleados(ArrayList<Empleado> empleados, Categoria empleadoVentas, Categoria administrador, Categoria gerente, int cantidadEmpleados) {
        System.out.println("\nDetalles de empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
        // Calcular y mostrar la nómina total
        CalculadoraSueldos.calcularTotalSueldos(empleados, cantidadEmpleados);
    }
}
