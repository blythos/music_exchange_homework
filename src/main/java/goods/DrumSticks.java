package goods;

import behaviours.ISell;

public class DrumSticks extends Product implements ISell {

    private int amountOfSticks;
    private String size;

    public DrumSticks(String description, double purchasePrice, double sellPrice, int amountOfSticks, String size) {
        super(description, purchasePrice, sellPrice);
        this.amountOfSticks = amountOfSticks;
        this.size = size;
    }

    public int getAmountOfSticks() {
        return amountOfSticks;
    }

    public String getSize() {
        return size;
    }
}
