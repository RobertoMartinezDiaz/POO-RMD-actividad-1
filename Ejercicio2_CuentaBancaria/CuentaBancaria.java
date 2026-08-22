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
        setNumeroCuenta(numeroCuenta);
        setTipoCuenta(tipoCuenta);
    }

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta){
        setNumeroCuenta(numeroCuenta);
        setSaldo(saldo);
        setTipoCuenta(tipoCuenta);
    }

    public String getNumeroCuenta() { return numeroCuenta; }
    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta != null && !numeroCuenta.isEmpty()) {
            this.numeroCuenta = numeroCuenta;
        }
    }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) {
        if (saldo >= 0.0) {
            this.saldo = saldo;
        }
    }

    public String getTipoCuenta() { return tipoCuenta; }
    public void setTipoCuenta(String tipoCuenta) {
        if (tipoCuenta != null && !tipoCuenta.isEmpty()) {
            this.tipoCuenta = tipoCuenta;
        }
    }

    @Override
    public String toString() {
        return "Número de Cuenta: " + this.numeroCuenta + "\n" +
                "Saldo: " + this.saldo + "\n" +
                "Tipo de Cuenta: " + this.tipoCuenta;
    }


}