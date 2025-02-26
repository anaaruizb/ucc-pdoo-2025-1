package co.edu.ucc.ana.bancos;

import java.util.Base64;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        // Uso de la solución: Transferencia bancaria
        CuentaBancaria cuenta1 = new CuentaBancaria("123456", 1000.0);
        CuentaBancaria cuenta2 = new CuentaBancaria("654321", 500.0);

        cuenta1.transferir(cuenta2, 200.0);

        cuenta1.mostrarSaldo();
        cuenta2.mostrarSaldo();
        
        // Mostrar información de identidad y del sector
        System.out.println("Identidad (Base64): " + getIdentidad());
        System.out.println("Patrón implementado: " + getPatron());
    }
    
    public static String getIdentidad() {
        String nombreCompleto = "Ana María Ruiz Bravo";
        return Base64.getEncoder().encodeToString(nombreCompleto.getBytes(StandardCharsets.UTF_8));
    }
    
    public static String getPatron() {
        return "Bancos";
    }
}
