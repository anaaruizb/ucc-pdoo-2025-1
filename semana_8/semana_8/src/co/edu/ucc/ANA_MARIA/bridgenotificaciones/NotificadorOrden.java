package co.edu.ucc.ANA_MARIA.bridgenotificaciones;

public class NotificadorOrden extends Notificador {
    public NotificadorOrden(CanalNotificacion canal) {
        super(canal);
    }

    public void notificar(String mensaje) {
        canal.enviar("Orden: " + mensaje);
    }
}

