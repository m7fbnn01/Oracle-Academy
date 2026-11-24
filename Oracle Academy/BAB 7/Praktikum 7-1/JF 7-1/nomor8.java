
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Card[] hand = new Card[5];

        int total = 0;
        int jumlahKartu = 0;
        String pilihan;

        // Mengambil dua kartu pertama
        for (int i = 0; i < 2; i++) {

            int suit = (int)(Math.random() * 4 + 1);
            int face = (int)(Math.random() * 13 + 1);

            hand[jumlahKartu] = new Card(suit, face);

            total += hand[jumlahKartu].points;

            jumlahKartu++;
        }

        // Menampilkan dua kartu pertama
        System.out.println("===== PERMAINAN KARTU =====");

        for (int i = 0; i < jumlahKartu; i++) {

            System.out.println(hand[i]);
        }

        System.out.println("Total poin: " + total);

        // Perulangan mengambil kartu
        while (total <= 21 && jumlahKartu < 5) {

            System.out.print("\nApakah ingin mengambil kartu lagi? (y/n): ");

            pilihan = input.next();

            if (pilihan.equalsIgnoreCase("n")) {
                break;
            }

            if (!pilihan.equalsIgnoreCase("y")) {
                System.out.println("Pilihan tidak valid!");
                continue;
            }

            // Mengambil kartu baru
            int suit = (int)(Math.random() * 4 + 1);
            int face = (int)(Math.random() * 13 + 1);

            hand[jumlahKartu] = new Card(suit, face);

            jumlahKartu++;

            // Menghitung total poin
            total = 0;

            for (int i = 0; i < jumlahKartu; i++) {

                total += hand[i].points;
            }

            // Menampilkan semua kartu
            System.out.println("\nKARTU DALAM HAND:");

            for (int i = 0; i < jumlahKartu; i++) {

                System.out.println(hand[i]);
            }

            System.out.println("Total poin: " + total);

            if (total > 21) {

                System.out.println("Poin melebihi 21!");

            } else if (jumlahKartu == 5) {

                System.out.println("Jumlah kartu sudah mencapai 5!");
            }
        }

        System.out.println("\n===== PERMAINAN SELESAI =====");
        System.out.println("Jumlah kartu: " + jumlahKartu);
        System.out.println("Total poin: " + total);

        input.close();
    }
}
