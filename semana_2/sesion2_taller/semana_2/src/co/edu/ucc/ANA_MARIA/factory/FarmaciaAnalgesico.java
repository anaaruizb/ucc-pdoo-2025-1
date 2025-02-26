package co.edu.ucc.ANA_MARIA.factory;

public class FarmaciaAnalgesico extends Farmacia {
    @Override
    public Medicamento crearMedicamento() {
        return new Analgesico();
    }
}
