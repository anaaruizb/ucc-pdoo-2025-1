package co.edu.ucc.ANA_MARIA.abstractfactory;

public class TarjetaDebito implements Tarjeta {
    @Override
    public void emitir() {
        System.out.println("Emitiendo tarjeta de débito.");
    }
}