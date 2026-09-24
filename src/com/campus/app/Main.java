package com.campus.app;
import com.campus.model.Student;
import com.campus.service.StudentService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the StudentID: ");
            int studentId = sc.nextInt();
            System.out.println("Enter the Student Name: ");
            String studentName = sc.next();
            System.out.println("Enter the Student Age: ");
            int studentAge = sc.nextInt();
            System.out.println("Enter the Student Department: ");
            String studentDepartment = sc.next();
            System.out.println("Number of Subjects: ");
            int numSubjects = sc.nextInt();
            int[] marks = new int[numSubjects];
            System.out.println("Enter the marks of " + numSubjects + " subjects: ");
            for (int i = 0; i < numSubjects; i++) {
                System.out.println("Enter the marks of subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
                sc.nextLine();
            }
            Student student = new Student(studentId, studentName, studentAge, studentDepartment, marks);
            student.displayStudentInfo(true);
            Student.displayStudentCount();
            StudentService studentService = new StudentService();
            studentService.displayReportCard(student);
        }
    }
}
