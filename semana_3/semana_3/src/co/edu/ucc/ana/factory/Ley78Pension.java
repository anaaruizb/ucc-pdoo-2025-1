package co.edu.ucc.ana.factory;

public class Ley78Pension implements LiquidacionPension {
    @Override
    public double calcularPension(double salario) {
        return salario * 15;
    }
}
