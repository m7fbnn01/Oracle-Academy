
public class Main {

    public static void main(String[] args) {

        int suitNumber1 = (int)(Math.random() * 4 + 1);
        int faceNumber1 = (int)(Math.random() * 13 + 1);

        int suitNumber2 = (int)(Math.random() * 4 + 1);
        int faceNumber2 = (int)(Math.random() * 13 + 1);

        Card card1 = new Card(suitNumber1, faceNumber1);
        Card card2 = new Card(suitNumber2, faceNumber2);

        System.out.println("KARTU PERTAMA");
        System.out.println(card1);
        System.out.println("Poin: " + card1.points);

        System.out.println("\nKARTU KEDUA");
        System.out.println(card2);
        System.out.println("Poin: " + card2.points);
    }
}
