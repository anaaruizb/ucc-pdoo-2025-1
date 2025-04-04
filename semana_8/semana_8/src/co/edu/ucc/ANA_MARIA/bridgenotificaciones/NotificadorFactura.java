package co.edu.ucc.ANA_MARIA.bridgenotificaciones;

public class NotificadorFactura extends Notificador {
    public NotificadorFactura(CanalNotificacion canal) {
        super(canal);
    }

    public void notificar(String mensaje) {
        canal.enviar("Factura: " + mensaje);
    }
}

