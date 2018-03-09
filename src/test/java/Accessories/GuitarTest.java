package Accessories;

import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar(10, 12, "Fender", InstrumentType.STRING, "Guitar Strings", 6);
    }

    @Test
    public void testCanGetItemName() {
        assertEquals("Guitar Strings", guitar.getItemName());
    }

    @Test
    public void testCanGetNumInPack() {
        assertEquals(6, guitar.getNumInPack());
    }
}
