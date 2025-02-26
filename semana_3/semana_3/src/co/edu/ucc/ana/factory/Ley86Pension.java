package co.edu.ucc.ana.factory;

public class Ley86Pension implements LiquidacionPension {
    public double calcularPension(double salario) {
        return salario * 5;
    }
}
