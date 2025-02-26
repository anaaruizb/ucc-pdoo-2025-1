package co.edu.ucc.ANA_MARIA.factory;

public class Antibiotico implements Medicamento {
    @Override
    public void administrar() {
        System.out.println("Administrando antibiótico para la infección.");
    }
}

