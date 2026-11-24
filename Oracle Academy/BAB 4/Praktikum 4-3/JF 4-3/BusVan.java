
import java.util.Scanner;

public class BusVan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jumlahOrang;
        int jumlahBus;
        int jumlahVan;

        System.out.print("Masukkan jumlah orang: ");
        jumlahOrang = input.nextInt();

        jumlahBus = jumlahOrang / 45;
        jumlahVan = jumlahOrang % 45;

        System.out.println("Jumlah bus: " + jumlahBus);
        System.out.println("Jumlah orang naik van: " + jumlahVan);

        input.close();
    }
}
