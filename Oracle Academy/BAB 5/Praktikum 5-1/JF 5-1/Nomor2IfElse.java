import java.util.Scanner;

public class Nomor2IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan bilangan kedua: ");
        double angka2 = input.nextDouble();

        double hasil = 0;

        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
            } else {
                System.out.println("Tidak bisa dibagi nol!");
                input.close();
                return;
            }
        } else if (operator == '%') {
            if (angka2 != 0) {
                hasil = angka1 % angka2;
            } else {
                System.out.println("Tidak bisa dibagi nol!");
                input.close();
                return;
            }
        } else {
            System.out.println("Operator tidak valid!");
            input.close();
            return;
        }

        System.out.println("Hasil: " + hasil);

        input.close();
    }
}