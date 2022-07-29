import studentsClasses.Classroom;
import studentsClasses.Student;

public class School {

    public static void main(String[] args) {

        System.out.println("Schools");
        Student.Builder student = Student.newBuilder();

        student.setId(23).setName("Joseo").build();

        Classroom.Builder StAssams = Classroom.newBuilder();

        StAssams.setProf("Bannerhan").addStudent(student)
            .addStudent(Student.newBuilder()
                .setName("MIke")
                .setId(34))
            .addStudent(Student.newBuilder()
                .setId(58)
                .setName("Rogan"));

        System.out.println(StAssams);
        System.out.println("Total students : " + StAssams.getStudentCount());
        System.out.println("Is there a Prof? " + StAssams.hasProf() + ", and his name is "
            + StAssams.getProf());

        System.out.println("Sacking the Prof");

    }
}