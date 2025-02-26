package co.edu.ucc.ANA_MARIA.factory;

public class Analgesico implements Medicamento {
    @Override
    public void administrar() {
        System.out.println("Administrando analgésico para el dolor.");
    }
}

