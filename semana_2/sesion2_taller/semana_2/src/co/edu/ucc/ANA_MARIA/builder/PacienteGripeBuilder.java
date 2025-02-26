package co.edu.ucc.ANA_MARIA.builder;

public class PacienteGripeBuilder extends PacienteBuilder {
    @Override
    public void definirSintomas() {
        paciente.setSintomas("Fiebre, tos, dolor de garganta");
    }

    @Override
    public void definirTratamiento() {
        paciente.setTratamiento("Reposo, líquidos, y paracetamol");
    }
}

