package edu.katheryn_azano.reto5.ejercicio5;

public class ItemsLista {

    private Producto producto;
    private int cant;

    public ItemsLista(Producto producto, int cant) {
        this.producto = producto;
        this.cant = cant;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

}
