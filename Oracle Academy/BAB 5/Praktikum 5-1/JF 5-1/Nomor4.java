import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat Anda di Bumi (lbs): ");
        double berat = input.nextDouble();

        System.out.println("\nPilih Planet:");
        System.out.println("1. Merkurius");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.println("5. Saturnus");
        System.out.println("6. Uranus");
        System.out.println("7. Neptunus");

        System.out.print("Pilihan Anda: ");
        int pilihan = input.nextInt();

        double hasil = 0;
        String planet = "";

        switch (pilihan) {
            case 1:
                planet = "Merkurius";
                hasil = berat * 0.38;
                break;

            case 2:
                planet = "Venus";
                hasil = berat * 0.91;
                break;

            case 3:
                planet = "Mars";
                hasil = berat * 0.38;
                break;

            case 4:
                planet = "Jupiter";
                hasil = berat * 2.36;
                break;

            case 5:
                planet = "Saturnus";
                hasil = berat * 0.92;
                break;

            case 6:
                planet = "Uranus";
                hasil = berat * 0.89;
                break;

            case 7:
                planet = "Neptunus";
                hasil = berat * 1.13;
                break;

            default:
                System.out.println("Pilihan tidak valid!");
                input.close();
                return;
        }

        System.out.println("Your weight on " + planet +
                           " is " + hasil + " lbs.");

        input.close();
    }
}