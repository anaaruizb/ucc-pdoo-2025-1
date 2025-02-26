package co.edu.ucc.ana.bancos;

public class CuentaBancaria {
    private final String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public boolean transferir(CuentaBancaria destino, double monto) {
        if (this.saldo >= monto) {
            this.saldo -= monto;
            destino.saldo += monto;
            return true;
        }
        return false;
    }

    public void mostrarSaldo() {
        System.out.println("Cuenta: " + numeroCuenta + ", Saldo: " + saldo);
    }
}
