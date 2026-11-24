
import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String pesan = "";

        System.out.println("Program Menguraikan Pesan Rahasia");
        System.out.println("Masukkan 10 angka (1-7)");

        int jumlah = 0;

        while (jumlah < 10) {

            System.out.print("Angka ke-" + (jumlah + 1) + ": ");
            int angka = input.nextInt();

            switch (angka) {
                case 1:
                    pesan += "D";
                    jumlah++;
                    break;

                case 2:
                    pesan += "W";
                    jumlah++;
                    break;

                case 3:
                    pesan += "E";
                    jumlah++;
                    break;

                case 4:
                    pesan += "L";
                    jumlah++;
                    break;

                case 5:
                    pesan += "H";
                    jumlah++;
                    break;

                case 6:
                    pesan += "O";
                    jumlah++;
                    break;

                case 7:
                    pesan += "R";
                    jumlah++;
                    break;

                default:
                    System.out.println("Angka tidak valid! Masukkan angka 1-7.");
            }
        }

        System.out.println("\nPesan rahasia: " + pesan);

        input.close();
    }
}
