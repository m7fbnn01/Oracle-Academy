
public class Student {

    private String name;
    private int credit;
    private double gpa;
    private double qualityPoints;

    // Constructor
    public Student(String name, int credit, double qualityPoints) {

        this.name = name;
        this.credit = credit;
        this.qualityPoints = qualityPoints;

        calculateGPA();
    }

    // Menghitung GPA
    public double calculateGPA() {

        if (credit > 0) {
            gpa = qualityPoints / credit;
        } else {
            gpa = 0;
        }

        return gpa;
    }

    // Menambahkan kredit dan poin mutu
    public void addCourse(int newCredit, double newPoints) {

        credit += newCredit;
        qualityPoints += newPoints;

        calculateGPA();
    }

    // Menampilkan data mahasiswa
    public void display() {

        System.out.println("Nama: " + name);
        System.out.println("Kredit: " + credit);
        System.out.println("Poin Mutu: " + qualityPoints);
        System.out.println("GPA/IP: " + gpa);

        System.out.println("--------------------");
    }
}
