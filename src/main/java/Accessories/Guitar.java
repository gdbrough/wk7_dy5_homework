package Accessories;

import Instruments.InstrumentType;

public class Guitar extends StringInst {

    public Guitar(int buyPrice, int sellPrice, String name, InstrumentType type, String itemName, int numInPack) {
        super(buyPrice, sellPrice, name, type, itemName, numInPack);
    }

}
