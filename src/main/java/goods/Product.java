package goods;

import behaviours.ISell;

public abstract class Product implements ISell {

    private String description;
    private double purchasePrice;
    private double sellPrice;

    public Product(String description, double purchasePrice, double sellPrice){
        this.description = description;
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup() {
        return this.sellPrice - this.purchasePrice;
    }

    public String getDescription() {
        return description;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
