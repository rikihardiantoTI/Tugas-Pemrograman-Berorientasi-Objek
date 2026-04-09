public class Teacher extends Person {
    private int numCourses = 0; // [cite: 39]
    private String[] courses = new String[10]; // [cite: 40]

    public Teacher(String name, String address) {
        super(name, address); // [cite: 41, 42]
    }

    // Format output khusus Teacher [cite: 46, 49]
    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }

    // Menambah kursus (kembalikan false jika kursus sudah ada) [cite: 44, 47]
    public boolean addCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) return false;
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }

    // Menghapus kursus (kembalikan false jika kursus tidak ditemukan) [cite: 45, 48]
    public boolean removeCourse(String course) {
        int index = -1;
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                index = i;
                break;
            }
        }
        if (index == -1) return false;

        // Geser sisa elemen array
        for (int i = index; i < numCourses - 1; i++) {
            courses[i] = courses[i + 1];
        }
        numCourses--;
        return true;
    }
}