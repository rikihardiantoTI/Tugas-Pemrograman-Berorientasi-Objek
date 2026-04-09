public class Student extends Person {
    private int numCourses = 0; // [cite: 25, 26]
    private String[] courses = new String[30]; // [cite: 27]
    private int[] grades = new int[30]; // [cite: 28]

    public Student(String name, String address) {
        super(name, address); // [cite: 29, 30]
    }

    // Format output khusus Student [cite: 36, 37]
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    // Menambah kursus dan nilai [cite: 32, 33]
    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    // Mencetak semua nilai kursus [cite: 34]
    public void printGrades() {
        System.out.print(getName() + " grades: ");
        for (int i = 0; i < numCourses; i++) {
            System.out.print(courses[i] + ":" + grades[i] + " ");
        }
        System.out.println();
    }

    // Menghitung rata-rata nilai 
    public double getAverageGrade() {
        if (numCourses == 0) return 0;
        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return (double) sum / numCourses;
    }
}