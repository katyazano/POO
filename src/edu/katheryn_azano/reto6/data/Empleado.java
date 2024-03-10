package edu.katheryn_azano.reto6.data;

public class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private int horasExtra;
    private String telefono;
    private String fechaNacimiento;
    private Categoria categoria;

    public Empleado(String nombre, int horasTrabajadas, int horasExtra, String telefono, String fechaNacimiento, Categoria categoria) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtra = horasExtra;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombreCompleto='" + nombre + '\'' +
                ", horasTrabajadas=" + horasTrabajadas +
                ", horasExtrasTrabajadas=" + horasExtra +
                ", telefono='" + telefono + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", categoria=" + this.categoria.getNombre() +
                '}';
    }

    public String getNombreCompleto() {
        return nombre;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombre = nombreCompleto;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasExtrasTrabajadas() {
        return horasExtra;
    }

    public void setHorasExtrasTrabajadas(int horasExtrasTrabajadas) {
        this.horasExtra = horasExtrasTrabajadas;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
