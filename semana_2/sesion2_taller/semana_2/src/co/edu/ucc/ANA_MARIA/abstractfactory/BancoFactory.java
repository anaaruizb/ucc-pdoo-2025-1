package co.edu.ucc.ANA_MARIA.abstractfactory;

public interface BancoFactory {
    Cuenta crearCuenta();
    Tarjeta crearTarjeta();
}

