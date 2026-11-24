
public class Factorial {

    public int num;

    // Constructor
    public Factorial(int num) {
        this.num = num;
    }

    // Method menghitung faktorial
    public int getFactorial() {

        int factorial = 1;

        for (int i = 1; i <= num; i++) {

            factorial *= i;
        }

        return factorial;
    }

    // Override toString
    @Override
    public String toString() {

        String hasil = "Factorial: " + num + "! = ";

        for (int i = 1; i <= num; i++) {

            hasil += i;

            if (i < num) {
                hasil += " * ";
            }
        }

        hasil += " = " + getFactorial();

        return hasil;
    }
}
