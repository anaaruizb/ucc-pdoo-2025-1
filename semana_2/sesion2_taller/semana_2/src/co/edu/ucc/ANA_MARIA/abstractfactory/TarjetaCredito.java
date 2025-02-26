package co.edu.ucc.ANA_MARIA.abstractfactory;

public class TarjetaCredito implements Tarjeta {
    @Override
    public void emitir() {
        System.out.println("Emitiendo tarjeta de crédito.");
    }
}
