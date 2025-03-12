package co.edu.ucc.ana.FactoryMethod;

// Fábrica de préstamos
public class Prestamo {
    public static Prestamo obtenerPrestamo(String tipo) {
        switch (tipo.toLowerCase()) {
            case "hipotecario" -> {
                return new PrestamoHipotecario();
            }
            case "automotriz" -> {
                return new PrestamoAutomotriz();
            }
            case "personal" -> {
                return new PrestamoPersonal();
            }
            default -> throw new IllegalArgumentException("Tipo de préstamo no válido");
        }
    }

    void mostrarDetalles() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
