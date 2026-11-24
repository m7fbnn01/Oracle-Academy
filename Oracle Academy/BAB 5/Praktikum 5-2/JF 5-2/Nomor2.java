public class Nomor2 {
    public static void main(String[] args) {

        String teks = "Hello World";

        int i = 0;

        while (i < teks.length()) {

            if (teks.charAt(i) == ' ') {
                System.out.println("Spasi ditemukan!");
                break;
            }

            i++;
        }
    }
}