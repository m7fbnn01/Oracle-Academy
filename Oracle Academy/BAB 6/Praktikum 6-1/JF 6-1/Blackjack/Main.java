package Blackjack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Deck deck = new Deck();

        Hand pemain = new Hand();
        Hand dealer = new Hand();

        deck.shuffle();

        System.out.println("================================");
        System.out.println("       PERMAINAN BLACKJACK");
        System.out.println("================================");

        // Membagikan 2 kartu kepada pemain dan dealer

        for (int i = 0; i < 2; i++) {

            pemain.addCard(deck.drawCard());
            dealer.addCard(deck.drawCard());
        }

        // Menampilkan kartu pemain

        System.out.println("\nKARTU PEMAIN:");

        pemain.printHand();

        // Menampilkan satu kartu dealer

        System.out.println("\nKARTU DEALER:");

        System.out.println(dealer.cards[0]);
        System.out.println("Satu kartu disembunyikan.");

        // Giliran pemain

        while (pemain.jumlahKartu < 5 && !pemain.isBust()) {

            System.out.print("\nApakah ingin mengambil kartu lagi? (y/n): ");

            String pilihan = input.next();

            if (pilihan.equalsIgnoreCase("y")) {

                pemain.addCard(deck.drawCard());

                System.out.println("\nKartu pemain:");

                pemain.printHand();

            } else if (pilihan.equalsIgnoreCase("n")) {

                break;

            } else {

                System.out.println("Pilihan tidak valid!");
            }
        }

        // Jika pemain kalah

        if (pemain.isBust()) {

            System.out.println("\nPemain melewati 21 poin.");
            System.out.println("DEALER MENANG!");

            input.close();
            return;
        }

        // Giliran dealer

        System.out.println("\n================================");
        System.out.println("          GILIRAN DEALER");
        System.out.println("================================");

        dealer.printHand();

        while (dealer.getTotal() < 16 &&
               dealer.jumlahKartu < 5) {

            System.out.println("\nDealer mengambil kartu.");

            dealer.addCard(deck.drawCard());

            dealer.printHand();
        }

        // Menentukan pemenang

        System.out.println("\n================================");
        System.out.println("          HASIL AKHIR");
        System.out.println("================================");

        System.out.println("\nTotal pemain: " + pemain.getTotal());
        System.out.println("Total dealer: " + dealer.getTotal());

        if (dealer.isBust()) {

            System.out.println("\nPEMAIN MENANG!");

        } else if (pemain.getTotal() > dealer.getTotal()) {

            System.out.println("\nPEMAIN MENANG!");

        } else if (pemain.getTotal() < dealer.getTotal()) {

            System.out.println("\nDEALER MENANG!");

        } else {

            System.out.println("\nHASIL SERI!");
        }

        input.close();
    }
}