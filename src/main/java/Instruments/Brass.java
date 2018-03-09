package Instruments;

public abstract class Brass extends Instrument {

    private int numValves;

    public Brass(int buyPrice, int sellPrice, String name, InstrumentType type, int numValves) {
        super(buyPrice, sellPrice, name, type);
        this.numValves = numValves;
    }

    public int getNumValves() {
        return numValves;
    }

    public void setNumValves(int numValves) {
        this.numValves = numValves;
    }
}
