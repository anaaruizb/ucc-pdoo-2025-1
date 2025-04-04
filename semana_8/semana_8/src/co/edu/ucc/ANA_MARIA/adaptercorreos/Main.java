package co.edu.ucc.ANA_MARIA.adaptercorreos;

import java.util.Base64;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        EnviadorCorreo servicio = new AdaptadorCorreo(new CorreoLegacy());
        servicio.enviarCorreo("anaruiz@ejemplo.com", "Bienvenido a la plataforma");

        System.out.println("Identidad (Base64): " + getIdentidad());
        System.out.println("Patrón implementado: " + getPatron());
    }

    public static String getIdentidad() {
        String nombre = "Ana Maria Ruiz Bravo";
        return Base64.getEncoder().encodeToString(nombre.getBytes(StandardCharsets.UTF_8));
    }

    public static String getPatron() {
        return "Adapter";
    }
}
