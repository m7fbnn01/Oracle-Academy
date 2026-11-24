
public class Card {

    String suit;
    String name;
    int points;

    public Card(int n1, int n2) {

        suit = getSuit(n1);
        name = getName(n2);
        points = getPoints(n2);
    }

    public String getSuit(int n) {

        switch (n) {
            case 1: return "Hearts";
            case 2: return "Diamonds";
            case 3: return "Clubs";
            case 4: return "Spades";
            default: return "Unknown";
        }
    }

    public String getName(int n) {

        switch (n) {
            case 1: return "Ace";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return String.valueOf(n);
        }
    }

    public int getPoints(int n) {

        if (n == 1) {
            return 11;
        } else if (n >= 11) {
            return 10;
        } else {
            return n;
        }
    }

    public String toString() {

        return "The " + name + " of " + suit;
    }
}
