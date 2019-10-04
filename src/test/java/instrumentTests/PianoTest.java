package instrumentTests;

import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("wood", "blue", InstrumentType.KEYBOARD, "grand", 300, 500);
    }

    @Test
    public void getMaterial() {
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("blue", piano.getColour());
    }

    @Test
    public void getType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void play() {
        assertEquals("plink plonk", piano.play());
    }

    @Test
    public void getSize(){
        assertEquals("grand", piano.getSize());
    }
}