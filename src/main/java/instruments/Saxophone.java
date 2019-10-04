package instruments;

public class Saxophone extends Instrument {

    private int valves;

    public Saxophone(String material, String colour, InstrumentType type, int valves) {
        super(material, colour, type);
        this.valves = valves;
    }

    public String play() {
        return "saxamaphone... saxamaphone...";
    }

    public int getValves() {
        return valves;
    }
}
