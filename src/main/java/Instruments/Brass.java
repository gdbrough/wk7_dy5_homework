package Instruments;

public abstract class Brass extends Instrument {

    private int numValves;

    public Brass(String name, int buyPrice, int sellPrice, InstrumentType type, int numValves) {
        super(name, buyPrice, sellPrice, type);
        this.numValves = numValves;
    }

    public int getNumValves() {
        return numValves;
    }

    public void setNumValves(int numValves) {
        this.numValves = numValves;
    }
}
