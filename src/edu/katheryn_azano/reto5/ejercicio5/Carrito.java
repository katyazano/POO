package edu.katheryn_azano.reto5.ejercicio5;

import java.util.ArrayList;

public class Carrito {

    private ArrayList<ItemsLista> productos; // ArrayList to store items

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cant) {
        ItemsLista item = new ItemsLista(producto, cant);
        productos.add(item);
    }

    public void eliminarProducto(Producto producto) {
        for (ItemsLista item : productos) {
            if (item.getProducto().equals(producto)) {
                productos.remove(item);
                break;
            }
        }
    }

    public void actualizarProducto(Producto producto, int cant) {
        for (ItemsLista item : productos) {
            if (item.getProducto().equals(producto)) {
                item.setCant(cant);
                break;
            }
        }
    }

    public ArrayList<ItemsLista> getProductos() { // Added getter method
        return productos;
    }

    public double generarImporteTotal() {
        double total = 0;
        for (ItemsLista item : productos) {
            total += item.getProducto().getPrecio() * item.getCant();
        }
        return total;
    }

}
