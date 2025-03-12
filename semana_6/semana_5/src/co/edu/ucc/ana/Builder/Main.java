package co.edu.ucc.ana.Builder;

public class Main {
    public static void main(String[] args) {
        // Creando un boleto usando el patrón Builder
        Boleto boleto1 = new Boleto.BoletoBuilder("Ejecutiva")
                            .agregarEquipajeExtra()
                            .seleccionarAsiento()
                            .agregarComidaEspecial()
                            .build();

        boleto1.mostrarDetalles();

        // Ejecutando getIdentidad() al final
        System.out.println("Identidad en Base64: " + boleto1.getIdentidad());
    }
}
