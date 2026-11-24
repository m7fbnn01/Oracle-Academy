
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Student mahasiswa = new Student(
            "Fabian",
            "Syah",
            "Pratama",
            new Date(108, 5, 15),
            "2026001",
            "Informatika",
            "Sarjana",
            2030
        );

        System.out.println("===== DATA MAHASISWA =====");

        System.out.println("Nama: " + mahasiswa.getName());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Jurusan: " + mahasiswa.getMajor());
        System.out.println("Gelar: " + mahasiswa.getDegree());

        System.out.println("Tahun Kelulusan: "
                + mahasiswa.getExpectedGraduationYear());

        String[] nilai = {"A", "B+", "A-", "B"};

        System.out.println("GPA: "
                + mahasiswa.calculateGPA(nilai));

        mahasiswa.changeMajor("Sistem Informasi");

        System.out.println("\n===== SETELAH GANTI JURUSAN =====");

        System.out.println("Jurusan Baru: "
                + mahasiswa.getMajor());
    }
}
