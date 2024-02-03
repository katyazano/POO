package edu.katheryn_azano.reto2.cajas.process;

import java.util.Scanner;

public class Procesos {
    // Variables compartidas entre métodos
    static int operaciones = 0, totalVentas = 0, totalCompras = 0;
    static double ingresosVentas = 0, egresosCompras = 0, montoCaja = 0;

    static Scanner scanner = new Scanner(System.in);

    /**
     * Método para realizar el proceso de inicio de sesión
     */
    public static void login(){
        System.out.println("Ingresa el usuario");
        String usuario = scanner.next();
        System.out.println("Ingresa la contraseña");
        String password = scanner.next();
        String userCorrecto = "usuario1";
        String passwordCorrecto = "password123";

        // Verificar si el usuario y contraseña son los correctos
        if(!(usuario.equals(userCorrecto) && password.equals(passwordCorrecto))) {
            System.out.println("Usuario o contraseña incorrectos, intente de nuevo");
            login(); // Llamada para volver a solicitar credenciales
        }
    }

    /**
     * Método para realizar el proceso de compra de cajas
     */
    public static void comprarCajas(){
        System.out.println("Ingrese el número de cajas a comprar: ");
        int cajasCompra = scanner.nextInt();
        System.out.println("Ingrese el costo de las cajas a comprar: ");
        double costoCompra = scanner.nextDouble();

        double montoCompra = cajasCompra * costoCompra;
        egresosCompras += montoCompra;
        montoCaja -= montoCompra;
        totalCompras += cajasCompra;
        operaciones++;

        System.out.println("La compra realizada por " + cajasCompra + " cajas al costo de " + costoCompra + " es igual a " + montoCompra);
    }

    /**
     * Método para realizar el proceso de venta de cajas
     */
    public static void venderCajas(){
        System.out.println("Ingrese el número de cajas a vender: ");
        int cajasVenta = scanner.nextInt();
        System.out.println("Ingrese el costo de las cajas a vender: ");
        double precioVenta = scanner.nextDouble();

        double montoVenta = cajasVenta * precioVenta;
        ingresosVentas += montoVenta;
        montoCaja += montoVenta;
        totalVentas += cajasVenta;
        operaciones++;

        System.out.println("La compra realizada por " + cajasVenta + " cajas al precio de " + precioVenta + " es igual a " + montoVenta);
    }

    /**
     * Método para mostrar un reporte de las operaciones
     */
    public static void reporte(){
        System.out.println("Cantidad total de ventas: " + totalVentas);
        System.out.println("Cantidad total de compras: " + totalCompras);
        System.out.println("Ingresos generados por ventas: " + ingresosVentas);
        System.out.println("Egresos generados por compras: " + egresosCompras);
        System.out.println("Monto en la caja: " + montoCaja);
    }

    /**
     * Método para mostrar un resumen final y despedirse del programa
     */
    public static void resumen(){
        System.out.println("Cantidad total de operaciones realizadas: " + operaciones);
        System.out.println("Cantidad total de ventas: " + totalVentas);
        System.out.println("Cantidad total de compras: " + totalCompras);
        System.out.println("Monto en la caja: " + montoCaja);
        System.out.println("Ingresos generados por ventas: " + ingresosVentas);
        System.out.println("Egresos generados por compras: " + egresosCompras);
        System.out.println("Hasta luego, ¡Gracias por usar el programa!");
    }
}
