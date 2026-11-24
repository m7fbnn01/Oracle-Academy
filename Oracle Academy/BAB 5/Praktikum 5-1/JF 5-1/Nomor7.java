import java.util.Scanner;

public class Nomor7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi ruangan: ");
        double tinggi = input.nextDouble();

        System.out.print("Masukkan panjang ruangan: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar ruangan: ");
        double lebar = input.nextDouble();

        double luasDinding = 2 * tinggi * (panjang + lebar);
        double luasPlafon = panjang * lebar;

        double totalLuas = luasDinding + luasPlafon;

        System.out.println("\nLuas dinding: " + luasDinding);
        System.out.println("Luas langit-langit: " + luasPlafon);
        System.out.println("Total luas yang dicat: " + totalLuas);

        int maxEmber5 = (int) Math.ceil(totalLuas / 1500) + 1;
        int maxEmber1 = (int) Math.ceil(totalLuas / 300) + 1;

        int ember5Terbaik = 0;
        int ember1Terbaik = 0;
        double biayaMinimum = Double.MAX_VALUE;

        for (int i = 0; i <= maxEmber5; i++) {
            for (int j = 0; j <= maxEmber1; j++) {

                double kapasitas = (i * 1500) + (j * 300);
                double biaya = (i * 15) + (j * 4);

                if (kapasitas >= totalLuas && biaya < biayaMinimum) {
                    biayaMinimum = biaya;
                    ember5Terbaik = i;
                    ember1Terbaik = j;
                }
            }
        }

        System.out.println("\n===== HASIL PEMBELIAN CAT =====");
        System.out.println("Ember 5 liter: " + ember5Terbaik);
        System.out.println("Ember 1 liter: " + ember1Terbaik);
        System.out.println("Total biaya: $" + biayaMinimum);

        input.close();
    }
}