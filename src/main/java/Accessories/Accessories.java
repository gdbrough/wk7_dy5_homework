package Accessories;

import Instruments.InstrumentType;
import Stock.StockItem;

public abstract class Accessories extends StockItem {

    private String name;
    private InstrumentType type;

    public Accessories(int buyPrice, int sellPrice, String name, InstrumentType type) {
        super(buyPrice, sellPrice);
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }
}
