package instrumentTests;

import instruments.Guitar;
import instruments.GuitarVariety;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("wood", "red", InstrumentType.STRING, 5, GuitarVariety.ACOUSTIC, 100, 150);
    }

    @Test
    public void getMaterial() {
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("red", guitar.getColour());
    }

    @Test
    public void getType() {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void play() {
        assertEquals("twing twang", guitar.play());
    }

    @Test
    public void canGetStrings(){
        assertEquals(5, guitar.getStrings());
    }

    @Test
    public void canGetVariety(){
        assertEquals(GuitarVariety.ACOUSTIC, guitar.getVariety());
    }
}