package co.edu.ucc.ana.FactoryMethod;

// Clase concreta PrestamoAutomotriz
public class PrestamoAutomotriz extends Prestamo {
    @Override
    public void mostrarDetalles() {
        System.out.println("Préstamo Automotriz: tasa 7%, plazo 5 años");
    }
}