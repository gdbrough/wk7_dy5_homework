package Accessories;

import Instruments.InstrumentType;

public abstract class StringInst extends Accessories{

    private String itemName;
    private int numInPack;

    public StringInst(String name, int buyPrice, int sellPrice, InstrumentType type, String itemName, int numInPack) {
        super(name, buyPrice, sellPrice, type);
        this.itemName = itemName;
        this.numInPack = numInPack;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getNumInPack() {
        return numInPack;
    }

    public void setNumInPack(int numInPack) {
        this.numInPack = numInPack;
    }
}
