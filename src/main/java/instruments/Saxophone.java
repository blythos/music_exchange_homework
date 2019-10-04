package instruments;

public class Saxophone extends Instrument {

    private int valves;

    public Saxophone(String material, String colour, InstrumentType type, int valves, double purchasePrice, double sellPrice) {
        super(material, colour, type, purchasePrice, sellPrice);
        this.valves = valves;
    }

    public String play() {
        return "saxamaphone... saxamaphone...";
    }

    public int getValves() {
        return valves;
    }
}
