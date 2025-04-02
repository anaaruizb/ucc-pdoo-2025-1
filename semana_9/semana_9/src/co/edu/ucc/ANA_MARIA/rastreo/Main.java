package co.edu.ucc.ANA_MARIA.rastreo;

import java.util.Base64;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        // Se crean los dispositivos GPS adaptados
        GPSDevice gps1 = new GarminAdapter(new GarminGPS());
        GPSDevice gps2 = new TomTomAdapter(new TomTomGPS());
        GPSDevice gps3 = new HuaweiAdapter(new HuaweiGPS());
        
        // Se crean los paneles con la implementación adecuada
        PanelRastreo panelDesktop;
        panelDesktop = new RastreoPanel(new DesktopPanel());
        PanelRastreo panelMobile = new RastreoPanel(new MobilePanel());
        
        // Se muestran los datos en cada panel
        panelDesktop.mostrarPanel(gps1.getLocation());
        panelMobile.mostrarPanel(gps2.getLocation());
        panelDesktop.mostrarPanel(gps3.getLocation());
        
        // Métodos requeridos
        System.out.println("Identidad (Base64): " + getIdentidad());
        System.out.println("Patrón implementado: " + getPatron());
    }

    public static String getIdentidad() {
        String nombreCompleto = "Ana Maria Ruiz Bravo";
        return Base64.getEncoder().encodeToString(nombreCompleto.getBytes(StandardCharsets.UTF_8));
    }

    public static String getPatron() {
        return "Adapter + Bridge";
    }
}

