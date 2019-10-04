package instrumentTests;

import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone("metal", "gold", "brass", 3);
    }

    @Test
    public void play() {
        assertEquals("saxamaphone... saxamaphone...", saxophone.play());
    }

    @Test
    public void getValves() {
        assertEquals(3, saxophone.getValves());
    }
}