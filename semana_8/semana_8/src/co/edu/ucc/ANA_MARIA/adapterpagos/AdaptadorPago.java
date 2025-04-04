package co.edu.ucc.ANA_MARIA.adapterpagos;

public class AdaptadorPago implements ProcesadorPago {
    private final SistemaExternoPago sistema;

    public AdaptadorPago(SistemaExternoPago sistema) {
        this.sistema = sistema;
    }

    @Override
    public void pagar(double monto) {
        sistema.realizarPago(monto);
    }
}
