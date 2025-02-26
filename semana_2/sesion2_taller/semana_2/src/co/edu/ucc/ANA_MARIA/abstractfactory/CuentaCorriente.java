package co.edu.ucc.ANA_MARIA.abstractfactory;

public class CuentaCorriente implements Cuenta {
    @Override
    public void abrir() {
        System.out.println("Abriendo cuenta corriente.");
    }
}

