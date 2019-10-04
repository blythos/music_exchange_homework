package instrumentTests;

import instruments.InstrumentType;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone("metal", "gold", InstrumentType.BRASS, 3, 125, 190);
    }

    @Test
    public void play() {
        assertEquals("saxamaphone... saxamaphone...", saxophone.play());
    }

    @Test
    public void getValves() {
        assertEquals(3, saxophone.getValves());
    }

    @Test
    public void canGetMarkUp(){
        assertEquals(65, saxophone.calculateMarkup(), 0);
    }

    @Test
    public void cangetSellPrice(){
        assertEquals(190, saxophone.getSellPrice(), 0);
    }

    @Test
    public void canGetPurchasePrice(){
        assertEquals(125, saxophone.getPurchasePrice(), 0);
    }
}