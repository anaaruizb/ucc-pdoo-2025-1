package co.edu.ucc.ANA_MARIA.abstractfactory;

public class CuentaAhorros implements Cuenta {
    @Override
    public void abrir() {
        System.out.println("Abriendo cuenta de ahorros.");
    }
}