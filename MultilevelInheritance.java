class Person {
    String name = "Rahul";

    void showName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int rollNo = 101;

    void showRollNo() {
        System.out.println("Roll No: " + rollNo);
    }
}

class Result extends Student {
    int marks = 85;

    void showResult() {
        System.out.println("Marks: " + marks);

        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Result r = new Result();

        r.showName();
        r.showRollNo();
        r.showResult();
    }
}