package co.edu.ucc.ana.transporte;

public class Autobus {
    public Boleto comprarBoleto(String viaje, String pasajero) {
        return new Boleto(viaje, pasajero);
    }
}
