package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(String name, double capacity, String contents) {
        super(name, capacity, contents, "CD");
    }

    @Override
    public void laserRead() {
        System.out.println("Reading data from CD...");
    }



    @Override
    public void laserWrite(String data) {
        System.out.println("Writing data to CD...");
        setContents(data);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}

