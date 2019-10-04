package goodsTests;

import goods.GuitarStrings;
import instruments.GuitarVariety;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarStringsTest {

    GuitarStrings strings;

    @Before
    public void before() {
        strings = new GuitarStrings("Bass Strings", 10, 15, GuitarVariety.BASS);
    }

    @Test
    public void getStringType() {
        assertEquals(GuitarVariety.BASS, strings.getStringType());
    }
}