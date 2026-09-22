package service;

import model.Student;
import utility.StudentUtility;

public class StudentService {

    public void displayStudent(Student student) {

        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Marks: " + student.getMarks());

        String grade = StudentUtility.calculateGrade(student);

        System.out.println("Grade: " + grade);
    }
}

