package org.launchcode;

public class Main {
    public static void main(String[] args) {
        CD myCD = new CD("Greatest Hits", 0.7, "Music");
        DVD myDvd = new DVD("Movie Collection", 4.7, "Movies", "DVD");

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCD.spinDisc();
        myCD.laserRead();
        myCD.laserWrite("New Music Album");
        System.out.println(myCD.reportDiscInfo());


        myDvd.spinDisc();
        myDvd.laserRead();
        myDvd.laserWrite("New Movie");
        System.out.println(myDvd.reportDiscInfo());
    }
}