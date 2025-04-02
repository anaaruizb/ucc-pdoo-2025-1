package co.edu.ucc.ANA_MARIA.rastreo;

public class HuaweiAdapter implements GPSDevice {
    private HuaweiGPS huawei;
    
    public HuaweiAdapter(HuaweiGPS huawei) {
        this.huawei = huawei;
    }

    @Override
    public String getLocation() {
        return huawei.getGpsData();
    }
}
