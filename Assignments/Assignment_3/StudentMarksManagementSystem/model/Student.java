package Assignment_3.StudentMarksManagementSystem.model;

import java.util.Arrays;

public class Student {

    private String name;
    private String nickName;
    private String address1;
    private String address2;
    private int totalMark;
    private int subjectCount = 0;
    private double gpa;
    private int[] marksArr = new int[6];
    private static int studentCount = 0;
    private static double highestGpa;
    private static int[] eachSubjectsTotal = new int[6];

    public void display() {
        System.out.println("\nName  : " + this.name);
        System.out.println("NickName  : " + this.nickName);
        System.out.println("Marks : " + Arrays.toString(this.marksArr));
        System.out.println("GPA   : " + this.gpa);
        System.out.println("Address 1 : " + this.address1);
        System.out.println("Address 2 : " + this.address2);
    }

    public void calculateGPA() {
        this.gpa = this.totalMark / this.subjectCount;

        if (studentCount == 0) {
            highestGpa = this.gpa;
        } else {
            if (this.gpa > highestGpa) {
                highestGpa = this.gpa;
            }
        }
    }

    public void calculateTotalMarks() {

        for (int i = 0; i < 6; i++) {
            this.totalMark += this.marksArr[i];
            eachSubjectsTotal[i] += marksArr[i];
            if (this.marksArr[i] != 0) {
                this.subjectCount += 1;
            }
        }
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static double getHighestGpa() {
        return highestGpa;
    }

    public static int[] getEachSubjectsTotal() {
        return eachSubjectsTotal;
    }

    public double getGpa() {
        return this.gpa;
    }

    public Student(String name, String nickName, int[] markList, String address1) {
        this.name = name;
        this.nickName = nickName;
        this.marksArr = markList;
        this.address1 = address1;
        this.address2 = "Not provided";
        calculateTotalMarks();
        calculateGPA();
        studentCount++;
    }

    public Student(String name, String nickName, int[] marksArr, String address1, String address2) {
        this.name = name;
        this.nickName = nickName;
        this.marksArr = marksArr;
        this.address1 = address1;
        this.address2 = address2;
        calculateTotalMarks();
        calculateGPA();
        studentCount++;
    }
}
