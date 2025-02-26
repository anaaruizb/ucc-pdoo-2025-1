package co.edu.ucc.ANA_MARIA.factory;

public abstract class Farmacia {
    public abstract Medicamento crearMedicamento();

    public void recetarMedicamento() {
        Medicamento medicamento = crearMedicamento();
        medicamento.administrar();
    }
}

