import studentsClasses.Classroom;
import studentsClasses.Student;

public class School {

    public static void main(String[] args) {

        System.out.println("Schools");
        Student.Builder student = Student.newBuilder();

        student.setId(23).setName("Joseo").build();

        Classroom.Builder classBuild = Classroom.newBuilder();



        System.out.println(student);
    }
}