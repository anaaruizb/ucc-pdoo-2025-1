package co.edu.ucc.ana.factory;

public class VehiculoFactory {
    public static Vehiculo crearVehiculo(String tipo) {
        if (tipo.equalsIgnoreCase("electrico")) {
            return (Vehiculo) new CarroElectrico();
        } else if (tipo.equalsIgnoreCase("gasolina")) {
            return (Vehiculo) new CarroGasolina();
        }
        return null; // <--- Elimina cualquier carácter raro aquí
    }
}

