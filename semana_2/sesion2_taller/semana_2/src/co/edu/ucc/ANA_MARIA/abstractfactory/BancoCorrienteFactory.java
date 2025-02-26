package co.edu.ucc.ANA_MARIA.abstractfactory;

public class BancoCorrienteFactory implements BancoFactory {
    @Override
    public Cuenta crearCuenta() {
        return new CuentaCorriente();
    }

    @Override
    public Tarjeta crearTarjeta() {
        return new TarjetaDebito();
    }
}

