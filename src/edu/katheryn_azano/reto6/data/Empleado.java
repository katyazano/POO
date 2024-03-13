package edu.katheryn_azano.reto6.data;

public class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private int horasExtra;
    private String telefono;
    private String edad;
    private Categoria categoria;

    /**Constructor de la clase Empleado
     * @param nombre
     * @param horasTrabajadas
     * @param horasExtra
     * @param telefono
     * @param edad
     * @param categoria
     */
    public Empleado(String nombre, int horasTrabajadas, int horasExtra, String telefono, String edad, Categoria categoria) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtra = horasExtra;
        this.telefono = telefono;
        this.edad = edad;
        this.categoria = categoria;
    }

    /**
     * Método toString para mostrar información del empleado
     * @return
     */
    @Override
    public String toString() {
        return "\n" + "nombreCompleto: " + nombre  + " - categoria: " +
                this.categoria.getNombre() +
                "\nhorasTrabajadas:" + horasTrabajadas +
                "\nhorasExtrasTrabajadas: " + horasExtra;
    }

    // Métodos getter y setter para el nombre
    public String getNombreCompleto() {
        return nombre;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombre = nombreCompleto;
    }

    // Métodos getter y setter para las horas trabajadas
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    // Métodos getter y setter para las horas extra trabajadas
    public int getHorasExtrasTrabajadas() {
        return horasExtra;
    }

    public void setHorasExtrasTrabajadas(int horasExtrasTrabajadas) {
        this.horasExtra = horasExtrasTrabajadas;
    }

    // Métodos getter y setter para el teléfono
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Métodos getter y setter para la edad
    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    // Métodos getter y setter para la categoría
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
