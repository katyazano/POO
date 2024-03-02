package edu.katheryn_azano.reto5.ejercicio3;

import java.util.List;

public class Pedido {

    private int numeroPedido;
    private List<Producto> productos;
    private int cantidad;
    private double total;

    public Pedido(int numeroPedido, List<Producto> productos) {
        this.numeroPedido = numeroPedido;
        this.productos = productos;
        this.cantidad = calcularCantidadTotal();
        this.total = calcularTotal();
    }

    private int calcularCantidadTotal() {
        int cantidadTotal = 0;
        for (Producto producto : productos) {
            cantidadTotal += producto.getCantidad();
        }
        return cantidadTotal;
    }

    private double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getImporteTotal();
        }
        return total;
    }
}