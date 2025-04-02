package co.edu.ucc.ANA_MARIA.rastreo;

public class RastreoPanel extends PanelRastreo {
    public RastreoPanel(PanelImplementacion implementacion) {
        super(implementacion);
    }

    @Override
    public void mostrarPanel(String datos) {
        implementacion.renderizar(datos);
    }
}
