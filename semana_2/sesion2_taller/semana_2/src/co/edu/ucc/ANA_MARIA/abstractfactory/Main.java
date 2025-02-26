package co.edu.ucc.ANA_MARIA.abstractfactory;

public class Main {
    public static void main(String[] args) {
        // Uso de la fábrica para cuenta corriente y tarjeta débito
        BancoFactory bancoCorriente = new BancoCorrienteFactory();
        Cuenta cuentaCorriente = bancoCorriente.crearCuenta();
        Tarjeta tarjetaDebito = bancoCorriente.crearTarjeta();
        cuentaCorriente.abrir();
        tarjetaDebito.emitir();

        // Uso de la fábrica para cuenta de ahorros y tarjeta crédito
        BancoFactory bancoAhorros = new BancoAhorrosFactory();
        Cuenta cuentaAhorros = bancoAhorros.crearCuenta();
        Tarjeta tarjetaCredito = bancoAhorros.crearTarjeta();
        
        cuentaAhorros.abrir();
        tarjetaCredito.emitir();
    }
}
