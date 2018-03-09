package Instruments;

public abstract class StringInst extends Instrument {

    private int numStrings;

    public StringInst(int buyPrice, int sellPrice, String name, InstrumentType type, int numStrings) {
        super(buyPrice, sellPrice, name, type);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }
}
