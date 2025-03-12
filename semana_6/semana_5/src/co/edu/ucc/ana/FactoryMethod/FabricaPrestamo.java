package co.edu.ucc.ana.FactoryMethod;

public class FabricaPrestamo {
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
}

