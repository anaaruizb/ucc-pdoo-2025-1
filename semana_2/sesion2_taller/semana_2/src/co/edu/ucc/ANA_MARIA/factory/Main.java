package co.edu.ucc.ANA_MARIA.factory;

import java.util.Base64;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        // Uso del patrón Factory
        Farmacia farmaciaAnalgesico = new FarmaciaAnalgesico();
        farmaciaAnalgesico.recetarMedicamento();

        Farmacia farmaciaAntibiotico = new FarmaciaAntibiotico();
        farmaciaAntibiotico.recetarMedicamento();

        // Al final, se invoca el método getIdentidad()
        System.out.println("Identidad (Base64): " + getIdentidad());
    }

    // Método que retorna el nombre completo codificado en Base64
    public static String getIdentidad() {
        String nombreCompleto = "Ana Maria Ruiz Bravo"; // Cambia esto si lo deseas
        return Base64.getEncoder().encodeToString(nombreCompleto.getBytes(StandardCharsets.UTF_8));
    }
}
