package goods;

import behaviours.ISell;
import instruments.InstrumentType;

public class SongBook extends Product implements ISell {

    int pages;
    InstrumentType instrument;

    public SongBook(String description, double purchasePrice, double sellPrice, int pages, InstrumentType instrument) {
        super(description, purchasePrice, sellPrice);
        this.pages = pages;
        this.instrument = instrument;
    }

    public InstrumentType getInstrument() {
        return instrument;
    }

    public int getPages() {
        return pages;
    }
}
