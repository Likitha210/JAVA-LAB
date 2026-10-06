package utility;

import model.Student;

public class StudentUtility {

    public static String calculateGrade(Student student) {

        int marks = student.getMarks();

        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
