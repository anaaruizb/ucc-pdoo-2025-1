package co.edu.ucc.ana.factory;

public class PensionFactory {
    public static LiquidacionPension crearLiquidacion(String ley) {
        if (ley.equalsIgnoreCase("ley78")) {
            return (LiquidacionPension) new Ley78Pension();
        } else if (ley.equalsIgnoreCase("ley86")) {
            return (LiquidacionPension) new Ley86Pension();
        } else if (ley.equalsIgnoreCase("ley98")) {
            return (LiquidacionPension) new Ley98Pension();
        } else if (ley.equalsIgnoreCase("ley100")) {
            return (LiquidacionPension) new Ley100Pension();
        } else if (ley.equalsIgnoreCase("leypetro")) {
            return (LiquidacionPension) new LeyPetroPension();
        }
        return null;
    }
}
