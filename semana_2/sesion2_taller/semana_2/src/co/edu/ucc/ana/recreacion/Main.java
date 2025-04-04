package co.edu.ucc.ana.recreacion;

import java.util.Base64;
import java.nio.charset.StandardCharsets;

/**
 * Historia de Usuario:
 * Como usuario, quiero poder reservar una cancha de fútbol 
 * para un día y hora específicos, para poder jugar con mis amigos.
 */
public class Main {
    public static void main(String[] args) {
        // Uso de la solución: Reservar cancha de fútbol
        CanchaReserva cancha = new CanchaReserva();
        cancha.reservarCancha("2023-10-15", "18:00", "Juan Perez");
        cancha.reservarCancha("2023-10-15", "20:00", "Carlos Gomez");
        cancha.mostrarReservas();
        
        // Mostrar información de identidad y del "patrón"
        System.out.println("Identidad (Base64): " + getIdentidad());
        System.out.println("Patrón implementado: " + getPatron());
    }
    
    public static String getIdentidad() {
        String nombreCompleto = "Ana Maria"; // Sin tildes para evitar errores de codificación
        return Base64.getEncoder().encodeToString(nombreCompleto.getBytes(StandardCharsets.UTF_8));
    }
    
    public static String getPatron() {
        return "Recreacion"; // Sin tildes
    }
}
