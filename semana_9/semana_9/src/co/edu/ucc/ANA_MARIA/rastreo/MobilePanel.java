package co.edu.ucc.ANA_MARIA.rastreo;

public class MobilePanel implements PanelImplementacion {
    @Override
    public void renderizar(String datos) {
        System.out.println("[MOBILE] Rastreo: " + datos);
    }
}
