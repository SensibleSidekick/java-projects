package org.launchcode;

public interface OpticalDisc {

    void laserRead();

    void laserWrite(String data);
    void spinDisc();
    String reportDiscInfo();
}
