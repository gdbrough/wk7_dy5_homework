package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp() {
        trumpet = new Trumpet(50, 75, "Cecilio", InstrumentType.BRASS, 3);
    }

    @Test
    public void testCanGetName() {
        assertEquals("Cecilio", trumpet.getName());
    }

    @Test
    public void testCanGetNumValves() {
        assertEquals(3, trumpet.getNumValves());
    }
}
