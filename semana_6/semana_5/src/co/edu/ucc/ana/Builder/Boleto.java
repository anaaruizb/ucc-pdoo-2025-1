package co.edu.ucc.ana.Builder;

import java.util.Base64;

public class Boleto {
    private String clase;
    private boolean equipajeExtra;
    private boolean seleccionAsiento;
    private boolean comidaEspecial;

    // Constructor privado
    private Boleto(BoletoBuilder builder) {
        this.clase = builder.clase;
        this.equipajeExtra = builder.equipajeExtra;
        this.seleccionAsiento = builder.seleccionAsiento;
        this.comidaEspecial = builder.comidaEspecial;
    }

    public void mostrarDetalles() {
        System.out.println("Clase: " + clase + 
                           ", Equipaje Extra: " + equipajeExtra + 
                           ", Selección de Asiento: " + seleccionAsiento + 
                           ", Comida Especial: " + comidaEspecial);
    }

    // Método getIdentidad() que retorna el nombre codificado en Base64
    public String getIdentidad() {
        String nombreCompleto = "Ana María Ruiz Bravo";
        return Base64.getEncoder().encodeToString(nombreCompleto.getBytes());
    }

    // CLASE INTERNA: Constructor Builder
    public static class BoletoBuilder {
        private String clase;
        private boolean equipajeExtra;
        private boolean seleccionAsiento;
        private boolean comidaEspecial;

        public BoletoBuilder(String clase) {
            this.clase = clase;
        }

        public BoletoBuilder agregarEquipajeExtra() {
            this.equipajeExtra = true;
            return this;
        }

        public BoletoBuilder seleccionarAsiento() {
            this.seleccionAsiento = true;
            return this;
        }

        public BoletoBuilder agregarComidaEspecial() {
            this.comidaEspecial = true;
            return this;
        }

        public Boleto build() {
            return new Boleto(this);
        }
    }
}

