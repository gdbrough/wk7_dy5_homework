package Instruments;

public abstract class StringInst extends Instrument {

    private int numStrings;

    public StringInst(String name, int buyPrice, int sellPrice, InstrumentType type, int numStrings) {
        super(name, buyPrice, sellPrice, type);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }
}
