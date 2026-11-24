
public class nomor5 {

    public static void main(String[] args) {

        Student student1 = new Student("Mary Jones", 14, 46);
        Student student2 = new Student("John Stiner", 60, 173);
        Student student3 = new Student("Ari Samala", 31, 69);

        System.out.println("DATA MAHASISWA");
        System.out.println("====================");

        student1.display();
        student2.display();
        student3.display();
    }
}
