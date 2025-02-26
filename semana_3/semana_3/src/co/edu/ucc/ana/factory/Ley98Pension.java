package co.edu.ucc.ana.factory;

public class Ley98Pension implements LiquidacionPension {
    @Override
    public double calcularPension(double salario) {
        return salario * 2.5;
    }
}

