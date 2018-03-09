package Instruments;

import Stock.ISell;

public class Guitar extends StringInst {

    private boolean acoustic;
    private int numPickUps;

    public Guitar(String name, int buyPrice, int sellPrice, InstrumentType type, int numStrings, boolean acoustic, int numPickUps) {
        super(name, buyPrice, sellPrice, type, numStrings);
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
