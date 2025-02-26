package co.edu.ucc.ANA_MARIA.builder;

public class Paciente {
    private String sintomas;
    private String tratamiento;

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public void mostrarInfo() {
        System.out.println("Síntomas: " + sintomas);
        System.out.println("Tratamiento: " + tratamiento);
    }
}


