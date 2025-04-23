package co.edu.ucc.ANA_MARIA.auto;

public class Main {

    public static void main(String[] args) {
        Auto modeloBasico;
        modeloBasico = new Auto.AutoBuilder()
                .setMotor("Gasolina")
                .setSistemaAudio("Estandar")
                .setSensoresProximidad(false)
                .build();

        Auto modeloPremium = new Auto.AutoBuilder()
                .setMotor("Electrico")
                .setSistemaAudio("Premium")
                .setSensoresProximidad(true)
                .build();

        modeloBasico.mostrarConfiguracion();
        modeloPremium.mostrarConfiguracion();

        System.out.println("Identidad (Base64): " + modeloPremium.getIdentidad());
        System.out.println("Patrón implementado: " + modeloPremium.getPatron());
    }
}
