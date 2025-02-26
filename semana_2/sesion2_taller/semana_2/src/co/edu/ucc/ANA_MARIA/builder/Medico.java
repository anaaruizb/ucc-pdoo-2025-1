package co.edu.ucc.ANA_MARIA.builder;

public class Medico {
    private PacienteBuilder pacienteBuilder;

    public void setPacienteBuilder(PacienteBuilder pb) {
        this.pacienteBuilder = pb;
    }

    public void construirPaciente() {
        pacienteBuilder.crearNuevoPaciente();
        pacienteBuilder.definirSintomas();
        pacienteBuilder.definirTratamiento();
    }

    // Solución: Método `getPaciente()` correctamente implementado
    public Paciente getPaciente() {
        return pacienteBuilder.getPaciente();
    }
}


