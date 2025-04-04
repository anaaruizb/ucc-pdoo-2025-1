package co.edu.ucc.ANA_MARIA.bridgefiguras;

import java.util.Base64;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        Figura f1 = new Circulo(new OpenGL());
        Figura f2 = new Rectangulo(new DirectX());

        f1.dibujar();
        f2.dibujar();

        System.out.println("Identidad (Base64): " + getIdentidad());
        System.out.println("Patrón implementado: " + getPatron());
    }

    public static String getIdentidad() {
        String nombre = "Ana Maria Ruiz Bravo";
        return Base64.getEncoder().encodeToString(nombre.getBytes(StandardCharsets.UTF_8));
    }

    public static String getPatron() {
        return "Bridge";
    }
}
