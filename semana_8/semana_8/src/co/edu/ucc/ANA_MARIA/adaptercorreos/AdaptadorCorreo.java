package co.edu.ucc.ANA_MARIA.adaptercorreos;

public class AdaptadorCorreo implements EnviadorCorreo {
    private CorreoLegacy correo;

    public AdaptadorCorreo(CorreoLegacy correo) {
        this.correo = correo;
    }

    public void enviarCorreo(String destino, String contenido) {
        correo.enviarMensaje(contenido, destino);
    }
}

