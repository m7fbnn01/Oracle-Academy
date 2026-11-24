
public class Guitar extends StringInstrument {

    private String brand;

    public Guitar(double price, boolean onSale,
                  int numberOfStrings, String brand) {

        super(price, onSale, numberOfStrings);

        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
