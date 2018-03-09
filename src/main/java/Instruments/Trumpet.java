package Instruments;

public class Trumpet extends Brass {

    public Trumpet(String name, int buyPrice, int sellPrice, InstrumentType type, int numValves) {
        super(name, buyPrice, sellPrice, type, numValves);
    }

    @Override
    public String play() {
        return "And the trumpets they go";
    }

    @Override
    public int calculateMarkup(int buyPrice, int sellPrice) {
        return sellPrice - buyPrice;
    }
}
