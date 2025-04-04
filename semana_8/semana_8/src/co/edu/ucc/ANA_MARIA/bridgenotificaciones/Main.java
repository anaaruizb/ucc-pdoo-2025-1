package co.edu.ucc.ANA_MARIA.bridgenotificaciones;

import java.util.Base64;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        Notificador noti1 = new NotificadorOrden(new Email());
        Notificador noti2 = new NotificadorFactura(new SMS());

        noti1.notificar("Tu pedido ha sido enviado.");
        noti2.notificar("Tu factura esta lista.");

        System.out.println("Identidad (Base64): " + getIdentidad());
        System.out.println("Patron implementado: " + getPatron());
    }

    public static String getIdentidad() {
        String nombre = "Ana Maria Ruiz Bravo";
        return Base64.getEncoder().encodeToString(nombre.getBytes(StandardCharsets.UTF_8));
    }

    public static String getPatron() {
        return "Bridge";
    }
}

