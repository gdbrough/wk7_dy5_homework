package Instruments;

public class Guitar extends StringInst {

    private boolean acoustic;
    private int numPickUps;

    public Guitar(int buyPrice, int sellPrice, String name, InstrumentType type, int numStrings, boolean acoustic, int numPickUps) {
        super(buyPrice, sellPrice, name, type, numStrings);
        this.acoustic = acoustic;
        this.numPickUps = numPickUps;
    }

    public boolean isAcoustic() {
        return acoustic;
    }

    public void setAcoustic(boolean acoustic) {
        this.acoustic = acoustic;
    }

    public int getNumPickUps() {
        return numPickUps;
    }

    public void setNumPickUps(int numPickUps) {
        this.numPickUps = numPickUps;
    }
}
