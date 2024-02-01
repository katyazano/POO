package edu.katheryn_azano.reto2.ui;

public class CLI {
    public static void login(){
        Scanner scanner = new Scanner(System.in);

            System.out.println("Ingresa el usuario");
            String usuario = scanner.next();
            System.out.println("Ingresa la contraseña");
            String password = scanner.next();

            if (usuario == "usuario1", password == "password123"){
                launchApp();
            } else{
                System.out.println("Usuario o contraseña incorrectos, intente de nuevo");
                login();
            }

    }

    /**
     * Este metodo despliega el menu de opciones al usuario
     */
    public static void showMenu(){
        System.out.println("Elige una de las siguientes opciones: \n1. Comprar cajas de papel \n2. Vender cajas de papel \n3. Mostrar reporte \n4. Salir del programa");
    }

    /**
     * Este metodo inicia la aplicación
     */
    public static void launchApp(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la opción deseada: ");
        int choice = scanner.nextInt();
        showMenu();

        switch (choice) {
            case 1:
                System.out.println("Ingrese el número de cajas a comprar: ");
                int numeroCajas = scanner.nextInt();
                System.out.println("Ingrese el costo de las cajas a vender: ");
                double costoCajas = scanner.nextDouble();
                double monto = costoCajas*numeroCajas;
                System.out.println("La compra realizada por "+numeroCajas" cajas al costo de "+costoCajas" es igual a"+monto);
                break;

            case 2:
                System.out.println("Ingrese el número de cajas a comprar: ");
                int numeroCajas = scanner.nextInt();
                System.out.println("Ingrese el costo de las cajas a vender: ");
                double costoCajas = scanner.nextDouble();
                double monto = costoCajas*numeroCajas;
                System.out.println("La venta realizada por "+numeroCajas" cajas al precio de "+costoCajas" es igual a"+monto);
                break;

            case 3:
                System.out.println("Ingrese la cantidad total de ventas: ");
                int totalVentas = scanner.nextInt();
                System.out.println("Ingrese la cantidad total de compras: ");
                double cantidadCompras = scanner.nextDouble();
                System.out.println("Ingrese los ingresos generados por ventas: ");
                int ingresos = scanner.nextInt();
                System.out.println("Ingrese los egresos generados por compras: ");
                double egresos = scanner.nextDouble();
                break;

            case 4:
                System.exit();
                break;
        }
    }
}
