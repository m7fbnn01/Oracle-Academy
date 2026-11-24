
public class Shape {

    private int numSides;
    private boolean regular;

    // Constructor pertama
    public Shape() {
        numSides = 0;
        regular = false;
    }

    // Constructor kedua
    public Shape(int numSides, boolean regular) {
        this.numSides = numSides;
        this.regular = regular;
    }

    // Getter numSides
    public int getNumSides() {
        return numSides;
    }

    // Setter numSides
    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    // Getter regular
    public boolean getRegular() {
        return regular;
    }

    // Setter regular
    public void setRegular(boolean regular) {
        this.regular = regular;
    }
}
