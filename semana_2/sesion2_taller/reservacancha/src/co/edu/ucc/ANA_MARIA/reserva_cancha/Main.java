package co.edu.ucc.ANA_MARIA.reserva_cancha;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.nio.charset.StandardCharsets;

/**
 * Historia de Usuario:
 * Como usuario, quiero poder reservar una cancha de fútbol para un día y hora específicos, 
 * para poder jugar con mis amigos.
 */

class CanchaReserva {
    private final Map<String, String> reservas = new HashMap<>();

    public boolean reservarCancha(String fecha, String hora, String usuario) {
        String clave = fecha + " " + hora;
        if (reservas.containsKey(clave)) {
            return false; // Ya está reservada
        }
        reservas.put(clave, usuario);
        return true;
    }

    public void mostrarReservas() {
        for (Map.Entry<String, String> entry : reservas.entrySet()) {
            String reservaInfo = "Fecha y Hora: " + entry.getKey() + ", Usuario: " + entry.getValue();
            System.out.println(new String(reservaInfo.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");

        CanchaReserva cancha = new CanchaReserva();
        cancha.reservarCancha("2023-10-15", "18:00", "Juan Pérez");
        cancha.reservarCancha("2023-10-15", "20:00", "Carlos Gómez");
        cancha.mostrarReservas();

        System.out.println("Identidad (Base64): " + getIdentidad());
        System.out.println("Patrón implementado: " + getPatron());
    }

    public static String getIdentidad() {
        String nombre = "Ana María Ruiz Bravo";
        return Base64.getEncoder().encodeToString(nombre.getBytes(StandardCharsets.UTF_8));
    }

    public static String getPatron() {
        return "Patrón utilizado: Estructural basado en colecciones";
    }
}

