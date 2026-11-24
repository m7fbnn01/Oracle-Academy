import java.util.Scanner;

public class nomor5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nilai = new int[5];
        int total = 0;
        double rataRata;

        System.out.println("PROGRAM MENGHITUNG RATA-RATA NILAI");
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai tes ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        rataRata = (double) total / nilai.length;

        System.out.println("\n===== HASIL NILAI =====");

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai tes ke-" + (i + 1) + ": " + nilai[i]);
        }

        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rataRata);

        input.close();
    }
}
