public class nomor6 {

    public static void main(String[] args) {

        Student student1 = new Student("Mary Jones", 14, 46);
        Student student2 = new Student("John Stiner", 60, 173);
        Student student3 = new Student("Ari Samala", 31, 69);

        // Menampilkan data sebelum perubahan
        System.out.println("DATA SEBELUM PENAMBAHAN");
        student3.display();

        // Menambahkan 13 kredit dan 52 poin mutu
        student3.addCourse(13, 52);

        // Menampilkan data setelah perubahan
        System.out.println("DATA SETELAH PENAMBAHAN");
        student3.display();
    }
}