
public class StringInstrument extends Instrument {

    protected int numberOfStrings;

    public StringInstrument(double price, boolean onSale,
                            int numberOfStrings) {

        super(price, onSale);

        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
