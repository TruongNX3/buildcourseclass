public class Course {
    private String name;
    private String[] students = new String[20];
    private int studentCount;

    public Course(String name) {
        this.name = name;
    }

    public void addstudent(String name) {
        students[studentCount] = name;
        studentCount++;
    }

    public void removeStudent(String name) {
        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i] == name) {
                found = true;
                for (int j = i + 1; j < studentCount; j++) {
                    students[j - 1] = students[j];
                }
                studentCount--;
                System.out.println("Student \"" + name + "\" removed!");
            }
        }
        if (!found) {
            System.out.println("Student \"" + name + "\" not existed in list, nothing removed!");
        }
    }


    public String getStudentName() {
        return name;
    }

    public String[] getStudents() {
        return students;
    }

    public int getStudentCount() {
        return studentCount;
    }
}
