package instruments;

public class Guitar extends Instrument {

    private int strings;
    private GuitarVariety variety;

    public Guitar(String material, String colour, InstrumentType type, int strings, GuitarVariety variety, double purchasePrice, double sellPrice) {
        super(material, colour, type, purchasePrice, sellPrice);
        this.strings = strings;
        this.variety = variety;
    }

    public String play() {
        return "twing twang";
    }

    public int getStrings() {
        return strings;
    }

    public GuitarVariety getVariety() {
        return variety;
    }
}
