package Shop;

import Accessories.GuitarA;
import Instruments.Guitar;
import Instruments.InstrumentType;
import Instruments.Trumpet;
import Stock.StockItem;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShopTest {

    Shop shop;
    StockItem guitar;
    StockItem trumpet;
    StockItem guitarA;

    @Before
    public void setUp() {
        guitar = new Guitar("Guitar", 150, 175, InstrumentType.STRING, 6, false, 2);
        trumpet = new Trumpet("Trumpet", 200, 250, InstrumentType.BRASS, 3);
        guitarA = new GuitarA("Guitar Strings", 17, 20, InstrumentType.STRING, "Strings", 6);
        ArrayList<StockItem> stockItems = new ArrayList<>();
        stockItems.add(guitar);
        stockItems.add(trumpet);
        stockItems.add(guitarA);
        shop = new Shop(stockItems);
    }


    @Test
    public void testStockItemInStock() {
        assertTrue(shop.getStockItems().contains(guitar));
    }

    @Test
    public void testCanGetStockSize() {
        assertEquals(3, shop.getStockSize());
    }

    @Test
    public void testCanGetStockItemName() {
        assertEquals("Guitar", shop.getStockItemName(0));
        assertEquals("Trumpet", shop.getStockItemName(1));
        assertEquals("Guitar Strings", shop.getStockItemName(2));
    }


    @Test
    public void testCanAddNewStock() {
        guitar = new Guitar("Bass Guitar", 350, 395, InstrumentType.STRING, 4, false, 2);
        shop.addStockItem(guitar);
        assertEquals(4, shop.getStockSize());
    }

    @Test
    public void testCanRemoveStockItem() {
        shop.removeStockItem(2);
        assertEquals(2, shop.getStockSize());
    }

    @Test
    public void testCanRemoveSpecificItem() {
        shop.removeSpecificStockItem(guitar);
        assertEquals(2, shop.getStockSize());
    }

    @Test
    public void testCanCalculateTotalMarkup(){
        assertEquals(78, shop.calculateTotalMarkup());
    }
}
