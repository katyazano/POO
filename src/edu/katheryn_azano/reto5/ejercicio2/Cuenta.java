package edu.katheryn_azano.reto5.ejercicio2;

public class Cuenta {

    private int numeroCuenta;
    private String tipoCuenta;
    private double saldo;
    private String transacciones;

    public Cuenta(int numeroCuenta, String tipoCuenta, double saldo, String transacciones) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.transacciones = transacciones;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(String transacciones) {
        this.transacciones = transacciones;
    }

    public void crearCuentaNueva() {
        // TODO: Implementar este método
    }

}