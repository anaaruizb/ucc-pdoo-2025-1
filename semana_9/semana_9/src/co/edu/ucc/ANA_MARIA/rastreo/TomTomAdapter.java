package co.edu.ucc.ANA_MARIA.rastreo;

public class TomTomAdapter implements GPSDevice {
    private TomTomGPS tomTom;
    
    public TomTomAdapter(TomTomGPS tomTom) {
        this.tomTom = tomTom;
    }

    @Override
    public String getLocation() {
        return tomTom.retrievePosition();
    }
}
