
public class Main {

    public static void main(String[] args) {

        // Membuat object ikan
        Fish amber = new Fish("AngelFish", 5);
        Fish james = new Fish("Guppy", 3);
        Fish budi = new Fish("GoldFish", 4);

        // Menampilkan data ikan
        System.out.println("===== DATA IKAN =====");

        System.out.println("Amber: " + amber.typeOfFish);
        System.out.println("Keramahan: " + amber.getFriendliness());

        System.out.println();

        System.out.println("James: " + james.typeOfFish);
        System.out.println("Keramahan: " + james.getFriendliness());

        System.out.println();

        System.out.println("Budi: " + budi.typeOfFish);
        System.out.println("Keramahan: " + budi.getFriendliness());

        // Menguji nicestFish dua parameter
        Fish hasil1 = Fish.nicestFish(amber, james);

        System.out.println("\n===== IKAN PALING RAMAH (2 IKAN) =====");
        System.out.println(hasil1.typeOfFish);
        System.out.println(hasil1.getFriendliness());

        // Menguji nicestFish variable argument
        Fish hasil2 = Fish.nicestFish(amber, james, budi);

        System.out.println("\n===== IKAN PALING RAMAH (3 IKAN) =====");
        System.out.println(hasil2.typeOfFish);
        System.out.println(hasil2.getFriendliness());
    }
}
