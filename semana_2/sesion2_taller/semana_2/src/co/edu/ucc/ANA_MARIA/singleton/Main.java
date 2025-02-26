package co.edu.ucc.ANA_MARIA.singleton;

import java.util.Base64;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        // Uso del patrón Singleton
        Banco banco = Banco.getInstance();
        banco.mostrarNombre();

        // Al final se invoca el método getIdentidad()
        System.out.println("Identidad (Base64): " + getIdentidad());
    }

    // Método que retorna el nombre codificado en Base64
    public static String getIdentidad() {
        String nombreCompleto = "Ana María Ruiz Bravo"; 
        return Base64.getEncoder().encodeToString(nombreCompleto.getBytes(StandardCharsets.UTF_8));
    }
}
