package co.edu.ucc.ANA_MARIA.builder;

public class Main {
    public static void main(String[] args) {
        Medico medico = new Medico();
        PacienteBuilder pacienteGripeBuilder = new PacienteGripeBuilder();

        medico.setPacienteBuilder(pacienteGripeBuilder);
        medico.construirPaciente();

        // Solución: Se obtiene correctamente el paciente
        Paciente paciente = medico.getPaciente(); 
        paciente.mostrarInfo();
    }
}
