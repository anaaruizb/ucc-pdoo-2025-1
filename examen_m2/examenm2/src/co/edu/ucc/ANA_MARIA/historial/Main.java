package co.edu.ucc.ANA_MARIA.historial;

public class Main {
    public static void main(String[] args) {
        HistorialMedico original = new HistorialMedico("Ana Ruiz", "Consulta inicial: saludable.");
        
        HistorialMedico copia = original.clone();
        copia.agregarNota("Nota adicional: se detecta presion alta.");

        // Mostramos ambos historiales
        System.out.println("Historial ORIGINAL:");
        original.mostrarHistorial();

        System.out.println("Historial CLONADO (con nueva nota):");
        copia.mostrarHistorial();

        // Métodos requeridos por la estructura del examen
        System.out.println("Identidad: " + copia.getIdentidad());
        System.out.println("Patrón aplicado: " + copia.getPatron());
    }
}
