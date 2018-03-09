package Accessories;

import Instruments.InstrumentType;

public abstract class StringInst extends Accessories{

    private String itemName;
    private int numInPack;

    public StringInst(int buyPrice, int sellPrice, String name, InstrumentType type, String itemName, int numInPack) {
        super(buyPrice, sellPrice, name, type);
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
