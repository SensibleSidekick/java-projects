package org.launchcode;

public class  DVD extends BaseDisc implements OpticalDisc {
    public DVD(String name, double capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    @Override
    public void laserRead() {
        System.out.println("Reading data from DVD...");

    }

    @Override
    public void laserWrite(String data) {
        System.out.println("Writing data to DVD...");
        setContents(data);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");

    }

    @Override
    public String reportDiscInfo() {
        return "";
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}

