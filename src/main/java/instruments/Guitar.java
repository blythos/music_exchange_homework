package instruments;

public class Guitar extends Instrument {

    private int strings;
    private GuitarVariety variety;

    public Guitar(String material, String colour, String type, int strings, GuitarVariety variety) {
        super(material, colour, type);
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
