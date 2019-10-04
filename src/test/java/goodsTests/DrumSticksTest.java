package goodsTests;

import goods.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks("New Drumsticks", 10, 20, 2, "medium");
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(10, drumSticks.calculateMarkup(), 0);
    }

    @Test
    public void canGetDescription() {
        assertEquals("New Drumsticks", drumSticks.getDescription());
    }

    @Test
    public void canGetPurchasePrice() {
        assertEquals(10, drumSticks.getPurchasePrice(), 0);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(20, drumSticks.getSellPrice(), 0);
    }

    @Test
    public void canGetAmountOfSticks() {
        assertEquals(2, drumSticks.getAmountOfSticks());
    }

    @Test
    public void canGetSize() {
        assertEquals("medium", drumSticks.getSize());
    }
}