public class Nomor3 {
    public static void main(String[] args) {

        String[] hari = {
            "Minggu",
            "Senin",
            "Selasa",
            "Rabu",
            "Kamis",
            "Jumat",
            "Sabtu"
        };

        for (int i = 1; i <= 365; i++) {

            String namaHari = hari[(i - 1) % 7];

            System.out.println("Hari ke-" + i + ": " + namaHari);
        }
    }
}