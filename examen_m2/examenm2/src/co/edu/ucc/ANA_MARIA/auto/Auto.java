package co.edu.ucc.ANA_MARIA.auto;

public class Auto {
    private final String motor;
    private final String sistemaAudio;
    private final boolean sensoresProximidad;

   
    private Auto(String motor, String sistemaAudio, boolean sensoresProximidad) {
        this.motor = motor;
        this.sistemaAudio = sistemaAudio;
        this.sensoresProximidad = sensoresProximidad;
    }

    public static class AutoBuilder {
        private String motor;
        private String sistemaAudio;
        private boolean sensoresProximidad;

        public AutoBuilder setMotor(String motor) {
            this.motor = motor;
            return this;
        }

        public AutoBuilder setSistemaAudio(String sistemaAudio) {
            this.sistemaAudio = sistemaAudio;
            return this;
        }

        public AutoBuilder setSensoresProximidad(boolean sensores) {
            this.sensoresProximidad = sensores;
            return this;
        }

        public Auto build() {
            return new Auto(motor, sistemaAudio, sensoresProximidad);
        }
    }

    public void mostrarConfiguracion() {
        System.out.println("Auto:");
        System.out.println("- Motor: " + motor);
        System.out.println("- Sistema de Audio: " + sistemaAudio);
        System.out.println("- Sensores de Proximidad: " + (sensoresProximidad ? "Si" : "No"));
        System.out.println();
    }

    public String getIdentidad() {
        return java.util.Base64.getEncoder().encodeToString("Ana Maria Ruiz Bravo".getBytes());
    }

    public String getPatron() {
        return "Builder";
    }
}
