package co.edu.ucc.ana.factory;

import java.util.Base64;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        // --------------------------
        // Historia de usuario 1: Sistema de Vehículos
        // --------------------------
        System.out.println("=== Sistema de Vehículos ===");
        Vehiculo vehiculo1 = VehiculoFactory.crearVehiculo("electrico");
        Vehiculo vehiculo2 = VehiculoFactory.crearVehiculo("gasolina");
        if (vehiculo1 != null) vehiculo1.conducir();
        if (vehiculo2 != null) vehiculo2.conducir();
        
        // --------------------------
        // Historia de usuario 2: Liquidación de Pensiones
        // --------------------------
        System.out.println("\n=== Sistema de Liquidación de Pensiones ===");
        // Datos de ejemplo (valores en unidades representativas)
        double salarioLey78 = 850;
        double salarioLey86 = 930;
        double salarioLey98 = 1020;
        double salarioLey100 = 1200;
        double salarioLeyPetro = 1400;
        
        LiquidacionPension pension78 = PensionFactory.crearLiquidacion("ley78");
        LiquidacionPension pension86 = PensionFactory.crearLiquidacion("ley86");
        LiquidacionPension pension98 = PensionFactory.crearLiquidacion("ley98");
        LiquidacionPension pension100 = PensionFactory.crearLiquidacion("ley100");
        LiquidacionPension pensionPetro = PensionFactory.crearLiquidacion("leypetro");
        
        System.out.println("Pensión Ley 78: " + (pension78 != null ? pension78.calcularPension(salarioLey78) : "No definida"));
        System.out.println("Pensión Ley 86: " + (pension86 != null ? pension86.calcularPension(salarioLey86) : "No definida"));
        System.out.println("Pensión Ley 98: " + (pension98 != null ? pension98.calcularPension(salarioLey98) : "No definida"));
        System.out.println("Pensión Ley 100: " + (pension100 != null ? pension100.calcularPension(salarioLey100) : "No definida"));
        System.out.println("Pensión Ley Petro: " + (pensionPetro != null ? pensionPetro.calcularPension(salarioLeyPetro) : "No definida"));
        
        // --------------------------
        // Al final se invoca el método getIdentidad()
        // --------------------------
        System.out.println("\nIdentidad (Base64): " + getIdentidad());
    }
    
    // Método que retorna el nombre completo codificado en Base64
    public static String getIdentidad() {
        String nombreCompleto = "Ana María Ruiz Bravo"; // Reemplaza con tu nombre completo si es necesario
        return Base64.getEncoder().encodeToString(nombreCompleto.getBytes(StandardCharsets.UTF_8));
    }
}
