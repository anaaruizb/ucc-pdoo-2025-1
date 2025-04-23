package co.edu.ucc.ANA_MARIA.historial;

public class HistorialMedico implements Cloneable {
    private final String nombrePaciente;
    private String notas;

    public HistorialMedico(String nombrePaciente, String notas) {
        this.nombrePaciente = nombrePaciente;
        this.notas = notas;
    }

    public void agregarNota(String nuevaNota) {
        this.notas += "\n" + nuevaNota;
    }

    public void mostrarHistorial() {
        System.out.println("Paciente: " + nombrePaciente);
        System.out.println("Historial Medico:\n" + notas);
        System.out.println();
    }

    @Override
    public HistorialMedico clone() {
        try {
            return (HistorialMedico) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("No se pudo clonar el historial", e);
        }
    }

    public String getIdentidad() {
        return java.util.Base64.getEncoder().encodeToString("Ana Maria Ruiz Bravo".getBytes());
    }

    public String getPatron() {
        return "Prototype";
    }
}
