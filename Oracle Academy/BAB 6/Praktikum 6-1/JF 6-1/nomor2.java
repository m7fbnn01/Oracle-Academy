public class nomor2 {
    public static void main(String[] args) {

        byte[] values = new byte[10];

        for (int i = 0; i < values.length; i++) {
            values[i] = 1;
        }

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
    }
}