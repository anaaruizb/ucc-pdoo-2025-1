package co.edu.ucc.ANA_MARIA.adaptercorreos;

public class CorreoLegacy {
    public void enviarMensaje(String texto, String email) {
        System.out.println("Enviando a " + email + ": " + texto);
    }
}
