package co.edu.ucc.ana.transporte;

import java.util.Base64;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        // Uso de la solución: Compra de boleto de autobús
        Autobus autobus = new Autobus();
        Boleto boleto = autobus.comprarBoleto("Ciudad A - Ciudad B", "Juan Pérez");
        boleto.mostrarBoleto();
        
        // Mostrar información de identidad y del sector
        System.out.println("Identidad (Base64): " + getIdentidad());
        System.out.println("Patrón implementado: " + getPatron());
    }
    
    public static String getIdentidad() {
        String nombreCompleto = "Ana María Ruiz Bravo";
        return Base64.getEncoder().encodeToString(nombreCompleto.getBytes(StandardCharsets.UTF_8));
    }
    
    public static String getPatron() {
        return "Transporte";
    }
}
