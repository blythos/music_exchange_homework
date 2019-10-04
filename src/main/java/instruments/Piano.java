package instruments;

public class Piano extends Instrument {

    String size;

    public Piano(String material, String colour, String type, String size) {
        super(material, colour, type);
        this.size = size;
    }

    public String play() {
        return "plink plonk";
    }

    public String getSize() {
        return size;
    }
}
