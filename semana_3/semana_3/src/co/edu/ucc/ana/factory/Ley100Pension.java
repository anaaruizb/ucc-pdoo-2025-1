package co.edu.ucc.ana.factory;

public class Ley100Pension implements LiquidacionPension {
    @Override
    public double calcularPension(double salario) {
        // Para efectos de este ejemplo, se retorna el salario sin multiplicador,
        // simulando que se utiliza el promedio de los últimos 10 años.
        return salario;
    }
}

