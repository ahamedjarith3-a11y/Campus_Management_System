package com.campus.model;

public class Student {
    //Encapsulation - Data Hiding
    // instance variables are declared as private to restrict direct access from outside the class
    private int studentId;
    private String studentName;
    private int age;
    private String department;
    private int[] marks;

    //static variable to keep track of the number of student objects created
    private static int studentCount = 0;

    //default constructor
    public Student() {
        studentCount++;
    }


    //parameterized constructor
    public Student(int studentId, String studentName, int age, String department, int[] marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.department = department;
        this.marks = marks;
        studentCount++;
    }
    //getters
    public int getStudentId() {
        return studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public int getAge() {
        return age;
    }
    public String getDepartment() { 
        return department;
    }
    public int[] getMarks() {   
        return marks;
    }
    //setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public void displayStudentInfo(){
        System.out.println("StudentID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Age: "+age);
        System.out.println("Depertment: "+ department);
    }
    
    public void displayStudentInfo(boolean showMarks){
        displayStudentInfo();
        if(showMarks){
            System.out.println("Marks: " + java.util.Arrays.toString(marks));
        }
    }

    //static method belong to the class rather than an instance of the class
    public static void displayStudentCount(){
        System.out.println("Total number of students: " + studentCount);
    }
}