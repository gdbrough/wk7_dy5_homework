package Instruments;

import Stock.ISell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp() {
        trumpet = new Trumpet("Trumpet", 50, 75, InstrumentType.BRASS, 3);
    }

    @Test
    public void testCanGetName() {
        assertEquals("Trumpet", trumpet.getName());
    }

    @Test
    public void testCanGetNumValves() {
        assertEquals(3, trumpet.getNumValves());
    }

    @Test
    public void testCanPlayTrumpet() {
        assertEquals("And the trumpets they go", trumpet.play());
    }

    @Test
    public void testCanCalculateMarkup() {
        assertEquals(25, trumpet.calculateMarkup(trumpet.getBuyPrice(), trumpet.getSellPrice()));
    }
}
