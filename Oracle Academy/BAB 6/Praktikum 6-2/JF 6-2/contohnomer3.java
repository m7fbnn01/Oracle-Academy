public class contohnomer3 {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int hasil = a / b;

            System.out.println("Hasil: " + hasil);

        } catch (ArithmeticException e) {

            System.out.println("Error: Tidak bisa membagi dengan nol!");

        }

        System.out.println("Program tetap berjalan.");
    }
}