package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String material;
    private String colour;
    private InstrumentType type;
    private double purchasePrice;
    private double sellPrice;

    public Instrument(String material, String colour, InstrumentType type, double purchasePrice, double sellPrice){
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkup() {
        return this.sellPrice - this.purchasePrice;
    }
}
