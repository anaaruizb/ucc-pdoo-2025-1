package co.edu.ucc.ANA_MARIA.bridgenotificaciones;

public class Email implements CanalNotificacion {
    public void enviar(String mensaje) {
        System.out.println("Email enviado: " + mensaje);
    }
}
