
import java.util.Scanner;

public class GalToLitScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double gallons;
        double liters;

        System.out.print("Masukkan jumlah galon: ");
        gallons = input.nextDouble();

        liters = gallons * 3.785;

        System.out.println("Hasil konversi:");
        System.out.println(gallons + " galon = " + liters + " liter");

        input.close();
    }
}
