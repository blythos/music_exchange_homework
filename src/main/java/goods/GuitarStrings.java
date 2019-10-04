package goods;

import behaviours.ISell;
import instruments.GuitarVariety;

public class GuitarStrings extends Product implements ISell {

    GuitarVariety stringType;

    public GuitarStrings(String description, double purchasePrice, double sellPrice, GuitarVariety stringType) {
        super(description, purchasePrice, sellPrice);
        this.stringType = stringType;
    }

    public GuitarVariety getStringType() {
        return stringType;
    }
}
