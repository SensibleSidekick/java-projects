package org.launchcode;

public class BaseDisc {
    private String name;
    private double capacity;
    private String contents;
    private String discType;
    public BaseDisc(String name, double capacity, String contents, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = Double.parseDouble(capacity);
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }


    public String reportDiscInfo(){
        return "Disc Name: " + name + ", Capacity: " + capacity + " GB, Contents: " + contents + ", Disc Type: " + discType;

    }
}
