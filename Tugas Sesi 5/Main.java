import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // --- Simulasi Mahasiswa --- [cite: 13]
            System.out.println("--- Input Data Mahasiswa ---");
            System.out.print("Nama Mahasiswa: ");
            String sName = input.nextLine(); 
            System.out.print("Alamat Mahasiswa: ");
            String sAddress = input.nextLine();
            Student student = new Student(sName, sAddress);

            System.out.print("Berapa banyak mata kuliah yang diambil? ");
            int nS = input.nextInt();
            input.nextLine(); // Membersihkan sisa Enter [cite: 18]

            for (int i = 0; i < nS; i++) {
                System.out.print("Nama Mata Kuliah ke-" + (i+1) + ": ");
                String cName = input.nextLine(); 
                System.out.print("Nilai: ");
                int cGrade = input.nextInt();
                input.nextLine(); // Bersihkan buffer lagi
                student.addCourseGrade(cName, cGrade);
            }

            // --- Simulasi Dosen --- [cite: 13]
            System.out.println("\n--- Input Data Dosen ---");
            System.out.print("Nama Dosen: ");
            String tName = input.nextLine();
            System.out.print("Alamat Dosen: ");
            String tAddress = input.nextLine();
            Teacher teacher = new Teacher(tName, tAddress);

            System.out.print("Masukkan Mata Kuliah yang diampu: ");
            String teachCourse = input.nextLine();
            if (teacher.addCourse(teachCourse)) {
                System.out.println("Mata kuliah " + teachCourse + " berhasil ditambahkan.");
            } else {
                System.out.println("Gagal! Mata kuliah sudah ada.");
            }

            // --- Output Hasil ---
            System.out.println("\n--- Ringkasan Data ---");
            System.out.println(student.toString()); // Output: Student: name (address) [cite: 37]
            student.printGrades();
            System.out.printf("Rata-rata Nilai: %.2f\n", student.getAverageGrade());

            System.out.println("\n" + teacher.toString()); // Output: Teacher: name (address) [cite: 49]

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: Pastikan input nilai berupa angka!");
        } finally {
            input.close();
        }
    }
}