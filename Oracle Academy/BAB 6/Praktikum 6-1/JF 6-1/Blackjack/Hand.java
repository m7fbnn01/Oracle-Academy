package Blackjack;

public class Hand {

    Card[] cards = new Card[5];

    int jumlahKartu = 0;

    public void addCard(Card card) {

        if (jumlahKartu < 5 && card != null) {

            cards[jumlahKartu] = card;
            jumlahKartu++;
        }
    }

    public int getTotal() {

        int total = 0;
        int jumlahAce = 0;

        for (int i = 0; i < jumlahKartu; i++) {

            total += cards[i].points;

            if (cards[i].name.equals("Ace")) {
                jumlahAce++;
            }
        }

        while (total > 21 && jumlahAce > 0) {

            total -= 10;
            jumlahAce--;
        }

        return total;
    }

    public void printHand() {

        for (int i = 0; i < jumlahKartu; i++) {

            System.out.println(cards[i]);
        }

        System.out.println("Total poin: " + getTotal());
    }

    public boolean isBust() {

        return getTotal() > 21;
    }
}