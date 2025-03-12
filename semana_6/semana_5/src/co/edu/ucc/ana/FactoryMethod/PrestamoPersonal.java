package co.edu.ucc.ana.FactoryMethod;

// Clase concreta PrestamoPersonal
public class PrestamoPersonal extends Prestamo {
    @Override
    public void mostrarDetalles() {
        System.out.println("Préstamo Personal: tasa 10%, plazo 3 años");
    }
}
