package Instruments;

public abstract class Keyboard extends Instrument {

    private int numKeys;
    private boolean stringed;

    public Keyboard(String name, int buyPrice, int sellPrice, InstrumentType type, int numKeys, boolean stringed) {
        super(name, buyPrice, sellPrice, type);
        this.numKeys = numKeys;
        this.stringed = stringed;
    }

    public int getNumKeys() {
        return numKeys;
    }

    public void setNumKeys(int numKeys) {
        this.numKeys = numKeys;
    }

    public boolean isStringed() {
        return stringed;
    }

    public void setStringed(boolean stringed) {
        this.stringed = stringed;
    }
}
