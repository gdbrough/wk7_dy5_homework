package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp() {
        trumpet = new Trumpet(50, 75, "Trumpet", InstrumentType.BRASS, 3);
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
}
