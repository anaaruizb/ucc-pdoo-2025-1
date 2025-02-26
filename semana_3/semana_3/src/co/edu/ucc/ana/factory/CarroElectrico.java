package co.edu.ucc.ana.factory;

public class CarroElectrico implements Vehiculo {
    @Override
    public void conducir() {
        System.out.println("Conduciendo un carro eléctrico");
    }
}
