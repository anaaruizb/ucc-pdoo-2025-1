package co.edu.ucc.ana.FactoryMethod;

public class PrestamoHipotecario extends Prestamo {
    @Override
    public void mostrarDetalles() {
        System.out.println("Préstamo Hipotecario: tasa 5%, plazo 30 años");
    }
}
