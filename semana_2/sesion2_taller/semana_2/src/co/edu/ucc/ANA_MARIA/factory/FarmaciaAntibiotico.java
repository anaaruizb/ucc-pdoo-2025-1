package co.edu.ucc.ANA_MARIA.factory;

public class FarmaciaAntibiotico extends Farmacia {
    @Override
    public Medicamento crearMedicamento() {
        return new Antibiotico();
    }
}

