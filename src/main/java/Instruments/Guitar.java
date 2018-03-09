package Instruments;

import Stock.ISell;

public class Guitar extends StringInst implements IPlay, ISell {

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

    @Override
    public String play() {
        return "While my guitar gently weeps";
    }

    @Override
    public int calculateMarkup(int buyPrice, int sellPrice) {
        return sellPrice - buyPrice;
    }
}
