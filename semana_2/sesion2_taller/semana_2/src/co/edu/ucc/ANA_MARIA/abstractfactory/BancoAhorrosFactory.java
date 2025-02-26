package co.edu.ucc.ANA_MARIA.abstractfactory;

public class BancoAhorrosFactory implements BancoFactory {
    @Override
    public Cuenta crearCuenta() {
        return new CuentaAhorros();
    }

    @Override
    public Tarjeta crearTarjeta() {
        return new TarjetaCredito();
    }
}

