
import java.util.Scanner;

public class nomor6 {

    static Scanner input = new Scanner(System.in);

    static int[][] A = new int[2][2];
    static int[][] B = new int[2][2];

    static boolean matriksA = false;
    static boolean matriksB = false;

    public static void main(String[] args) {

        char pilihan;
        boolean jalan = true;

        while (jalan) {

            System.out.println("\n===== MENU OPERASI MATRIKS =====");
            System.out.println("a. Masukkan Matriks A");
            System.out.println("b. Masukkan Matriks B");
            System.out.println("c. Tampilkan A + B");
            System.out.println("d. Tampilkan A - B");
            System.out.println("e. Tampilkan A * B");
            System.out.println("f. Keluar");

            System.out.print("Masukkan pilihan: ");
            pilihan = input.next().charAt(0);

            switch (pilihan) {

                case 'a':
                    masukkanA();
                    break;

                case 'b':
                    masukkanB();
                    break;

                case 'c':
                    if (cekMatriks()) {
                        tambah();
                    }
                    break;

                case 'd':
                    if (cekMatriks()) {
                        kurang();
                    }
                    break;

                case 'e':
                    if (cekMatriks()) {
                        kali();
                    }
                    break;

                case 'f':
                    System.out.println("Program selesai.");
                    jalan = false;
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }
        }

        input.close();
    }

    static void masukkanA() {

        System.out.println("\nMasukkan Matriks A:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = input.nextInt();
            }
        }

        matriksA = true;
        System.out.println("Matriks A berhasil disimpan!");
    }

    static void masukkanB() {

        System.out.println("\nMasukkan Matriks B:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = input.nextInt();
            }
        }

        matriksB = true;
        System.out.println("Matriks B berhasil disimpan!");
    }

    static boolean cekMatriks() {

        if (!matriksA || !matriksB) {
            System.out.println("Masukkan Matriks A dan B terlebih dahulu!");
            return false;
        }

        return true;
    }

    static void tambah() {

        System.out.println("\nHASIL A + B:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.print((A[i][j] + B[i][j]) + "\t");
            }

            System.out.println();
        }
    }

    static void kurang() {

        System.out.println("\nHASIL A - B:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.print((A[i][j] - B[i][j]) + "\t");
            }

            System.out.println();
        }
    }

    static void kali() {

        int[][] hasil = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                for (int k = 0; k < 2; k++) {

                    hasil[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("\nHASIL A * B:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.print(hasil[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
