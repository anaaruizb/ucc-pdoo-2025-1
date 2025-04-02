package co.edu.ucc.ANA_MARIA.rastreo;

public abstract class PanelRastreo {
    protected PanelImplementacion implementacion;

    public PanelRastreo(PanelImplementacion implementacion) {
        this.implementacion = implementacion;
    }

    public abstract void mostrarPanel(String datos);
}

