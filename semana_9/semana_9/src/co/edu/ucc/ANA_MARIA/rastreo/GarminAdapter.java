package co.edu.ucc.ANA_MARIA.rastreo;

public class GarminAdapter implements GPSDevice {
    private GarminGPS garmin;
    
    public GarminAdapter(GarminGPS garmin) {
        this.garmin = garmin;
    }

    @Override
    public String getLocation() {
        return garmin.fetchCoordinates();
    }
}
