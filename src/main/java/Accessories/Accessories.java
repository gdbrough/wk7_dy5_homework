package Accessories;

import Instruments.InstrumentType;
import Stock.ISell;
import Stock.StockItem;

public abstract class Accessories extends StockItem implements ISell {

    private InstrumentType type;

    public Accessories(String name, int buyPrice, int sellPrice, InstrumentType type) {
        super(name, buyPrice, sellPrice);
        this.type = type;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    @Override
    public int calculateMarkup(int buyPrice, int sellPrice) {
        return sellPrice - buyPrice;
    }
}
