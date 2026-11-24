package Blackjack;

import java.util.Random;

public class Deck {

    Card[] cardArray = new Card[52];
    int posisi = 0;

    Deck() {

        int cardCount = 0;

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 13; j++) {

                cardArray[cardCount] = new Card(i, j);
                cardCount++;
            }
        }
    }

    public void print() {

        for (int i = 0; i < cardArray.length; i++) {
            System.out.println(cardArray[i]);
        }
    }

    public void shuffle() {

        Random random = new Random();

        for (int i = cardArray.length - 1; i > 0; i--) {

            int j = random.nextInt(i + 1);

            Card temp = cardArray[i];
            cardArray[i] = cardArray[j];
            cardArray[j] = temp;
        }

        posisi = 0;

        System.out.println("Kartu berhasil diacak!");
    }

    public Card drawCard() {

        if (posisi < cardArray.length) {
            return cardArray[posisi++];
        }

        return null;
    }
}