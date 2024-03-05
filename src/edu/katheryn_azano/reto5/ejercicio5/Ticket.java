package edu.katheryn_azano.reto5.ejercicio5;

public class Ticket {

    private Carrito carrito;

    public Ticket(Carrito carrito) {
        this.carrito = carrito;
    }

    public void generarTicket() {
        // Imprimir detalles del carrito
        System.out.println("**Carrito de compras**");
        for (ItemsLista item : carrito.getProductos()) {
            System.out.println("Producto: " + item.getProducto().getNombre());
            System.out.println("Cantidad: " + item.getCant());
            System.out.println("Precio: $" + item.getProducto().getPrecio());
            System.out.println("Importe: $" + item.getProducto().getPrecio() * item.getCant());
        }
        System.out.println("**Total: $" + carrito.generarImporteTotal());
    }

}