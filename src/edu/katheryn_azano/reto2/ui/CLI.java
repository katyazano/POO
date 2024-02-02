package edu.katheryn_azano.reto2.ui;

import edu.katheryn_azano.reto2.process.procesos;

import java.util.Scanner;

public class CLI {
    public static int showMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige una de las siguientes opciones: \n1. Comprar cajas de papel \n2. Vender cajas de papel \n3. Mostrar reporte \n4. Salir del programa");
        System.out.println("Ingrese la opción deseada: ");
        int choice = scanner.nextInt();
        return choice;
    }

    /**
     * Este metodo inicia la aplicación
     */
    public static void launchApp(){
        procesos.login();
        Scanner scanner = new Scanner(System.in);
        int choice = showMenu();

        int total_cajas_vendidas = 0;
        int total_cajas_compras = 0;
        double monto_compras = 0;
        double monto_ventas = 0;

        int total_operaciones = 0;
        switch (choice) {
            case 1:
                System.out.println("Ingrese el número de cajas a comprar: ");
                int numeroCajas1 = scanner.nextInt();
                total_cajas_compras += numeroCajas1;
                System.out.println("Ingrese el costo de las cajas a comprar: ");
                double costoCajas1 = scanner.nextDouble();
                double monto1 = costoCajas1 * numeroCajas1;
                monto_compras += monto1;
                System.out.println("La compra realizada por " + numeroCajas1 + " cajas al costo de " + costoCajas1 + " es igual a " + monto1);
                total_operaciones += 1;
                showMenu();
                break;

            case 2:
                System.out.println("Ingrese el número de cajas a vender: ");
                int numeroCajas2 = scanner.nextInt();
                total_cajas_vendidas += numeroCajas2;
                System.out.println("Ingrese el costo de las cajas a vender: ");
                double costoCajas2 = scanner.nextDouble();
                double monto2 = costoCajas2 * numeroCajas2;
                monto_ventas += monto2;
                System.out.println("La venta realizada por " + numeroCajas2 + " cajas al precio de " + costoCajas2 + " es igual a " + monto2);
                total_operaciones += 1;
                showMenu();
                break;

            case 3:
                double monto_caja = monto_ventas-monto_compras;
                System.out.println("La cantidad total de ventas: " + total_cajas_vendidas);
                System.out.println("La cantidad total de compras: " + total_cajas_compras);
                System.out.println("Los ingresos generados por ventas: " + monto_ventas);
                System.out.println("Los egresos generados por compras: " + monto_compras);
                System.out.println("Monto en la caja: " + monto_caja);
                total_operaciones += 1;
                showMenu();
                break;

            case 4:
                monto_caja = monto_ventas-monto_compras;
                System.out.println("La cantidad total de operaciones realizadas: " + total_operaciones);
                System.out.println("La cantidad total de ventas: " + total_cajas_vendidas);
                System.out.println("La cantidad total de compras: " + total_cajas_compras);
                System.out.println("Los ingresos generados por ventas: " + monto_ventas);
                System.out.println("Los egresos generados por compras: " + monto_compras);
                System.out.println("Monto en la caja: " + monto_caja);
                System.out.println("Hasta luego tonoto(s)");
                return;

            default:
                System.out.println("Opción invalida. Seleccione una correcta");
                showMenu();
        }

    }
}
