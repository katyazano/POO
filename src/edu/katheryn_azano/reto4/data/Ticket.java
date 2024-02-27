package edu.katheryn_azano.reto4.data;

public class Ticket {
    // Declaración de variables
    private final int totalBoletosVendidos;
    private final String nombreCompradorPrincipal;
    private final int pasajerosAdicionales;
    private final double totalVenta;

    /**
     * Constructor de la clase Ticket.
     * @param totalBoletosVendidos El total de boletos vendidos.
     * @param nombreCompradorPrincipal El nombre del comprador principal.
     * @param pasajerosAdicionales El número de pasajeros adicionales.
     * @param totalVenta El total de la venta.
     */
    public Ticket(int totalBoletosVendidos, String nombreCompradorPrincipal, int pasajerosAdicionales, double totalVenta) {
            this.totalBoletosVendidos = totalBoletosVendidos;
            this.nombreCompradorPrincipal = nombreCompradorPrincipal;
            this.pasajerosAdicionales = pasajerosAdicionales;
            this.totalVenta = totalVenta;
    }

    /**
     * Genera una representación de cadena del ticket de venta.
     * @return Una cadena que representa el ticket de venta.
     */
    @Override
    public String toString() {
        return "---------- Ticket de Venta ----------\n" +
                "Total de boletos vendidos en esta venta: " + totalBoletosVendidos + "\n" +
                "Nombre del comprador principal: " + nombreCompradorPrincipal + "\n" +
                "Pasajeros adicionales al comprador principal: " + pasajerosAdicionales + "\n" +
                "Total de venta: $" + totalVenta + "\n" +
                "--------------------------------------";
    }
}
