package edu.katheryn_azano.reto6.data;

public class Categoria {
    private String nombre; // Nombre de la categoría
    private String clave; // Clave de la categoría
    private double sueldoBase; // Sueldo base de la categoría
    private double pagoPorHoraExtra; // Pago por hora extra de la categoría

    // Constructor de la clase Categoria
    public Categoria(String nombre, String clave, double sueldoBase, double pagoPorHoraExtra) {
        this.nombre = nombre;
        this.clave = clave;
        this.sueldoBase = sueldoBase;
        this.pagoPorHoraExtra = pagoPorHoraExtra;
    }

    // Métodos getter y setter para el nombre de la categoría
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter para el sueldo base de la categoría
    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    // Métodos getter y setter para el pago por hora extra de la categoría
    public double getPagoPorHoraExtra() {
        return pagoPorHoraExtra;
    }

    public void setPagoPorHoraExtra(double pagoPorHoraExtra) {
        this.pagoPorHoraExtra = pagoPorHoraExtra;
    }
}
