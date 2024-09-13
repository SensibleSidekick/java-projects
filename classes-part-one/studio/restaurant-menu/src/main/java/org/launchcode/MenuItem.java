package org.launchcode;

public class MenuItem {

    private String itemCategory;
    private double price;
    private String description;
    private boolean isNew;

    private MenuItem(String itemCategory, double price, String description, boolean isNew) {
        this.itemCategory = itemCategory;
        this.price = price;
        this.description = description;
        this.isNew = isNew;
    }



    public void  setIsNew (boolean aIsNew) {
        isNew = aIsNew;
    }

    public String getItemCategory () {
        return this.itemCategory;
    }
    public double getPrice () {
        return this.price;
    }
    public String getDescription() {
        return this.description;
    }

    public boolean getIsNew () {
        return this.isNew;
    }
}
