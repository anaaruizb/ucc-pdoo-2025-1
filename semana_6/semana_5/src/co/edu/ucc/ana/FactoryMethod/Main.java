package co.edu.ucc.ana.FactoryMethod;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        Prestamo prestamo1 = FabricaPrestamo.obtenerPrestamo("hipotecario");
        prestamo1.mostrarDetalles();

        Prestamo prestamo2 = FabricaPrestamo.obtenerPrestamo("automotriz");
        prestamo2.mostrarDetalles();

        Prestamo prestamo3 = FabricaPrestamo.obtenerPrestamo("personal");
        prestamo3.mostrarDetalles();

        System.out.println("Identidad codificada: " + getIdentidad());
    }

    public static String getIdentidad() {
        String nombre = "Ana María Ruiz Bravo";
        return Base64.getEncoder().encodeToString(nombre.getBytes(StandardCharsets.UTF_8));
    }
}

