package co.edu.ucc.ana.recreacion;

import java.util.HashMap;
import java.util.Map;

public class CanchaReserva {
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
            System.out.println("Fecha y Hora: " + entry.getKey() + ", Usuario: " + entry.getValue());
        }
    } // <- Se cerró correctamente el método
}
