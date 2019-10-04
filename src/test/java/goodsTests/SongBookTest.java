package goodsTests;

import goods.SongBook;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SongBookTest {

    SongBook book;

    @Before
    public void before() {
        book = new SongBook("Guitar Songs 101", 1, 12, 72, InstrumentType.STRING);
    }

    @Test
    public void canGetInstrument() {
        assertEquals(InstrumentType.STRING, book.getInstrument());
    }

    @Test
    public void canGetPages() {
        assertEquals(72, book.getPages());
    }
}