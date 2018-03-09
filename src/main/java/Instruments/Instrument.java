package Instruments;

import Stock.ISell;
import Stock.StockItem;

public abstract class Instrument extends StockItem implements IPlay, ISell{

    private InstrumentType type;

    public Instrument(String name, int buyPrice, int sellPrice, InstrumentType type) {
        super(name, buyPrice, sellPrice);
        this.type = type;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }
}
