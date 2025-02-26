package co.edu.ucc.ANA_MARIA.builder;

public abstract class PacienteBuilder {
    protected Paciente paciente;

    public void crearNuevoPaciente() {
        paciente = new Paciente();
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public abstract void definirSintomas();
    public abstract void definirTratamiento();
}


