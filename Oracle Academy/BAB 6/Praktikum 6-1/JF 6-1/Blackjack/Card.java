package Blackjack;

public class Card {

    String suit;
    String name;
    int points;

    Card(int n1, int n2) {

        suit = getSuit(n1);
        name = getName(n2);
        points = getPoints(name);
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

    public String getSuit(int n) {

        switch (n) {
            case 1: return "Hearts";
            case 2: return "Diamonds";
            case 3: return "Clubs";
            case 4: return "Spades";
            default: return "Unknown";
        }
    }

    public int getPoints(String name) {

        if (name.equals("Ace")) {
            return 11;
        } else if (name.equals("Jack") ||
                   name.equals("Queen") ||
                   name.equals("King")) {
            return 10;
        } else {
            return Integer.parseInt(name);
        }
    }

    public String toString() {
        return name + " of " + suit + " (" + points + " poin)";
    }
}
