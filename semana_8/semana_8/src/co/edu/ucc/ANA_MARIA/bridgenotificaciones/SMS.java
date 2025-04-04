package co.edu.ucc.ANA_MARIA.bridgenotificaciones;

public class SMS implements CanalNotificacion {
    public void enviar(String mensaje) {
        System.out.println("SMS enviado: " + mensaje);
    }
}
