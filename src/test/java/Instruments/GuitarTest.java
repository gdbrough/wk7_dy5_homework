package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Guitar", 100, 125, InstrumentType.STRING, 6, false, 2);
    }

    @Test
    public void testCanGetName() {
        assertEquals("Guitar", guitar.getName());
    }

    @Test
    public void testCanGetBuyPrice() {
        assertEquals(100, guitar.getBuyPrice());
    }

    @Test
    public void testCanGetSellPrice() {
        assertEquals(125, guitar.getSellPrice());
    }

    @Test
    public void testCanGetInstrumentType() {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void testCanGetNumberOfStrings() {
        assertEquals(6, guitar.getNumStrings());
    }

    @Test
    public void testCanGetIfAcoustic() {
        assertFalse(guitar.isAcoustic());
    }

    @Test
    public void testcanGetNumberOfPickUps() {
        assertEquals(2, guitar.getNumPickUps());
    }

    @Test
    public void testGuitarCanBePlayed() {
        assertEquals("While my guitar gently weeps", guitar.play());
    }

    @Test
    public void testCanCalculateMarkup() {
        assertEquals(25, guitar.calculateMarkup(guitar.getBuyPrice(), guitar.getSellPrice()));
    }
}
