package co.edu.ucc.ana.factory;

public class LeyPetroPension implements LiquidacionPension {
    @Override
    public double calcularPension(double salario) {
        double pension = salario; // Cálculo base

        // Se impone un tope máximo de 3.5 salarios.
        if (pension > salario * 3.5) {
            pension = salario * 3.5;
        }

        // Para salarios bajos se aplica un descuento del 30% (se paga solo el 70%).
        if (salario < 1500) { // Umbral de ejemplo
            pension *= 0.7;
        }

        return pension;
    }
}
