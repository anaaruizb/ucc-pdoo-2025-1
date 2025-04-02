package co.edu.ucc.ANA_MARIA.rastreo;

public class DesktopPanel implements PanelImplementacion {
    @Override
    public void renderizar(String datos) {
        System.out.println("[DESKTOP] Rastreo: " + datos);
    }
}
