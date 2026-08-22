package Ejercicio2_CuentaBancaria;
public class CuentaBancaria {
    String numeroCuenta;
    double saldo;
    String tipoCuenta;


    public CuentaBancaria(){
        numeroCuenta = "00000000";
        saldo = 0.0;
        tipoCuenta = "Ahorros";

    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Número de Cuenta: " + this.numeroCuenta + "\n" +
                "Saldo: " + this.saldo + "\n" +
                "Tipo de Cuenta: " + this.tipoCuenta;
    }


}