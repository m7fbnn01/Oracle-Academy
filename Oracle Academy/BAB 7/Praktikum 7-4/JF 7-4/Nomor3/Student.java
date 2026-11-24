
import java.util.Date;

public class Student extends Person {

    private String nim;
    private double gpa;
    private String major;
    private String degree;
    private int expectedGraduationYear;

    public Student(String firstName, String middleName,
                   String lastName, Date dateOfBirth,
                   String nim, String major,
                   String degree, int expectedGraduationYear) {

        super(firstName, middleName, lastName, dateOfBirth);

        this.nim = nim;
        this.major = major;
        this.degree = degree;
        this.expectedGraduationYear = expectedGraduationYear;
        this.gpa = 0.0;
    }

    public String getNim() {
        return nim;
    }

    public double getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public String getDegree() {
        return degree;
    }

    public int getExpectedGraduationYear() {
        return expectedGraduationYear;
    }

    public void changeMajor(String newMajor) {
        major = newMajor;
    }

    public double calculateGPA(String[] grades) {

        if (grades == null || grades.length == 0) {
            gpa = 0.0;
            return gpa;
        }

        double total = 0;

        for (String grade : grades) {

            switch (grade.toUpperCase()) {

                case "A":
                    total += 4.0;
                    break;

                case "A-":
                    total += 3.67;
                    break;

                case "B+":
                    total += 3.33;
                    break;

                case "B":
                    total += 3.0;
                    break;

                case "B-":
                    total += 2.67;
                    break;

                case "C+":
                    total += 2.33;
                    break;

                case "C":
                    total += 2.0;
                    break;

                case "D":
                    total += 1.0;
                    break;

                case "F":
                    total += 0.0;
                    break;

                default:
                    throw new IllegalArgumentException(
                        "Nilai tidak valid: " + grade
                    );
            }
        }

        gpa = total / grades.length;

        return gpa;
    }
}
