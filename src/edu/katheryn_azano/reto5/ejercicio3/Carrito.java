package edu.katheryn_azano.reto5.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Producto> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public void modificarCantidad(Producto producto, int nuevaCantidad) {
        producto.setCantidad(nuevaCantidad);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public double getTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getImporteTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Carrito{" +
                "productos=" + productos +
                '}';
    }
}
