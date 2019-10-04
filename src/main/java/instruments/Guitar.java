package instruments;

public class Guitar extends Instrument {


    public Guitar(String material, String colour, String type) {
        super(material, colour, type);

    }

    public String play() {
        return "twing twang";
    }
}
