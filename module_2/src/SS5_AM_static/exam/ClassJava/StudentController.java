package SS5_AM_static.exam.ClassJava;

public class StudentController {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.toString());

        Student.setName("Hoang");
        student.setClasses("C1222G1");
        System.out.println(student.toString());

    }
}
