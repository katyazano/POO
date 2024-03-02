package edu.katheryn_azano.reto5.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Cartera {

    private List<Cliente> clientes;
    private List<Cuenta> cuentas;

    public Cartera() {
        this.clientes = new ArrayList<>();
        this.cuentas = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public void realizarTransacciones(Cuenta cuenta, double monto, String tipoTransaccion) {
        // TODO: Implementar este método
    }

    public void mostrarSaldo(Cuenta cuenta) {
        // TODO: Implementar este método
    }

    public void realizarPagos(Cuenta cuenta, double monto) {
        // TODO: Implementar este método
    }

}