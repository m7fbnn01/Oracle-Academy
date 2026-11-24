
public class nomor3 {

    public static void main(String[] args) {

        // Object pertama menggunakan constructor tanpa parameter
        Animal animal1 = new Animal();

        // Object kedua menggunakan constructor berparameter
        Animal animal2 = new Animal(70, 5, 10);

        // Menampilkan kecepatan
        System.out.println("Animal #1 memiliki kecepatan "
                + animal1.getSpeed());

        System.out.println("Animal #2 memiliki kecepatan "
                + animal2.getSpeed());
    }
}
