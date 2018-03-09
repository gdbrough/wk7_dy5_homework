package Accessories;

import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarATest {

    GuitarA guitarA;

    @Before
    public void setUp() {
        guitarA = new GuitarA("Fender", 10, 12, InstrumentType.STRING, "Guitar Strings", 6);
    }

    @Test
    public void testCanGetItemName() {
        assertEquals("Guitar Strings", guitarA.getItemName());
    }

    @Test
    public void testCanGetNumInPack() {
        assertEquals(6, guitarA.getNumInPack());
    }

    @Test
    public void testCanCalculateMarkUp() {
        assertEquals(2, guitarA.calculateMarkup(guitarA.getBuyPrice(), guitarA.getSellPrice()));
    }
}
