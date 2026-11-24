
public class Main {

    public static void main(String[] args) {

        Guitar gitar = new Guitar(
            2000000,
            true,
            6,
            "Yamaha"
        );

        System.out.println("===== DATA GITAR =====");

        System.out.println("Merek: " + gitar.getBrand());

        System.out.println("Jumlah Senar: "
                + gitar.getNumberOfStrings());

        System.out.println("Harga Awal: Rp2.000.000");

        System.out.println("Harga Setelah Diskon: Rp"
                + gitar.getPrice());

        System.out.println("Harga Karyawan: Rp"
                + gitar.getEmployeePrice());
    }
}
