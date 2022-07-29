import studentsClasses.Classroom;
import studentsClasses.Student;

public class School {

    public static void main(String[] args) {

        System.out.println("Schools");
        Student.Builder student = Student.newBuilder();

        student.setId(23).setName("Joseo").build();

        Classroom.Builder classBuild = Classroom.newBuilder();

        classBuild.setProf("Bannerhan").addStudent(student)
            .addStudent(Student.newBuilder()
                .setName("MIke")
                .setId(34))
            .addStudent(Student.newBuilder()
                .setId(58)
                .setName("Rogan"));

        System.out.println(classBuild);
        System.out.println("Total students : " + classBuild.getStudentCount());
        System.out.println("Is there a Prof? " + classBuild.hasProf() + ", and his name is "
            + classBuild.getProf());
    }
}