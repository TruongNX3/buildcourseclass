public class CourseTest {
    public static void displayCourse(Course course) {
        System.out.println("Course \"" + course.getStudentName()
                + "\" has " + course.getStudentCount()
                + " student(s): {");
        String[] students = course.getStudents();
        for (int i = 0; i < course.getStudentCount(); i++) {
            System.out.println("\t\"" + students[i] + "\",");
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        Course course = new Course("javer");
        displayCourse(course);

        String andy = "andy";
        course.addstudent(andy);
        displayCourse(course);

        String booby = "booby";
        course.addstudent(booby);
        displayCourse(course);

        course.removeStudent(andy);
        displayCourse(course);

        String samy = "samy";
        course.removeStudent(andy);
        displayCourse(course);

    }
}