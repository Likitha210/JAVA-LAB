import model.Student;
import service.StudentService;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(101, "Rahul", 85);

        StudentService service = new StudentService();

        service.displayStudent(student);
    }
}
