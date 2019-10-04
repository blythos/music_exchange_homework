package instruments;

public class Piano extends Instrument {

    String size;

    public Piano(String material, String colour, InstrumentType type, String size, double purchasePrice, double sellPrice) {
        super(material, colour, type, purchasePrice, sellPrice);
        this.size = size;
    }

    public String play() {
        return "plink plonk";
    }

    public String getSize() {
        return size;
    }
}
