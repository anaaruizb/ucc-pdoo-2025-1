package co.edu.ucc.ana.transporte;

public class Boleto {
    private final String viaje;
    private final String pasajero;

    public Boleto(String viaje, String pasajero) {
        this.viaje = viaje;
        this.pasajero = pasajero;
    }

    public void mostrarBoleto() {
        System.out.println("Viaje: " + viaje + ", Pasajero: " + pasajero);
    }
}
