package edu.katheryn_azano.reto4.process;

import edu.katheryn_azano.reto4.data.Pasajero;
import edu.katheryn_azano.reto4.data.Ticket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que maneja la venta de boletos y la visualización de datos de venta.
 */
public class Manager {
    // Declaración de variables y lista
    private static final List<Pasajero> listaPasajeros = new ArrayList<>();
    private static int totalBoletosVendidos = 0;
    private static double totalDineroVendido = 0;
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Método para realizar la venta de los boletos.
     */
    public static void ventaBoleto(){
        System.out.println("Venta de boletos:");
        // Pedir al usuario el nombre del comprador principal
        System.out.print("Ingrese el nombre del comprador principal: ");
        String nombrePrincipal = scanner.next();

        // Crear un objeto Pasajero para el comprador principal
        Pasajero compradorPrincipal = new Pasajero(nombrePrincipal, true);
        listaPasajeros.add(compradorPrincipal);
        totalBoletosVendidos++;

        System.out.print("Ingrese la cantidad de boletos que desea comprar: ");
        int cantidadBoletos = scanner.nextInt() - 1; // Se resta 1 para excluir al comprador principal

        totalBoletosVendidos += cantidadBoletos;

        for (int i = 0; i < cantidadBoletos; i++) {
            System.out.print("Ingrese el nombre del pasajero para el boleto " + (i + 2) + ": ");
            String nombrePasajero = scanner.next();
            Pasajero pasajero = new Pasajero(nombrePasajero, false);
            listaPasajeros.add(pasajero);
        }

        // Calcular el total de venta
        double totalVenta = totalBoletosVendidos * 1250.50;

        // Incrementar el total de dinero vendido
        totalDineroVendido += totalVenta;

        // Mostrar ticket de venta
        Ticket ticket = new Ticket(totalBoletosVendidos, nombrePrincipal, cantidadBoletos, totalVenta);
        System.out.println(ticket.toString());
    }

    /**
     * Método para mostrar los datos de venta.
     */
    public static void showData(){
        System.out.println("Datos de venta:");
        System.out.println("Nombres de los pasajeros:");
        int contadorPasajeros = 0;
        for (Pasajero pasajero : listaPasajeros) {
            contadorPasajeros++;
            String tipoPasajero = pasajero.esComprador() ? "(comprador) " : "";
            System.out.println("Pasajero " + contadorPasajeros + ": " + tipoPasajero + pasajero.getNombre());
        }
        System.out.println("Total de pasajeros: " + contadorPasajeros);
        System.out.println("Total de dinero vendido: $" + totalDineroVendido);
    }
}