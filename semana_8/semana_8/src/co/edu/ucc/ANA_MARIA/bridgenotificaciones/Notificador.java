package co.edu.ucc.ANA_MARIA.bridgenotificaciones;

public abstract class Notificador {
    protected CanalNotificacion canal;

    public Notificador(CanalNotificacion canal) {
        this.canal = canal;
    }

    public abstract void notificar(String mensaje);
}
