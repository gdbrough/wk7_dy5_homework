package Instruments;

public class Trumpet extends Brass implements IPlay{

    public Trumpet(int buyPrice, int sellPrice, String name, InstrumentType type, int numValves) {
        super(buyPrice, sellPrice, name, type, numValves);
    }

    @Override
    public String play() {
        return "And the trumpets they go";
    }
}
