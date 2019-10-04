package instrumentTests;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("wood", "red", "acoustic");
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
        assertEquals("acoustic", guitar.getType());
    }

    @Test
    public void play() {
        assertEquals("twing twang", guitar.play());
    }
}