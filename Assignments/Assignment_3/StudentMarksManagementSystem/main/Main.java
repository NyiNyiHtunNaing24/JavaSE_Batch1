package Assignment_3.StudentMarksManagementSystem.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Assignment_3.StudentMarksManagementSystem.model.Student;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Student[] studentArr = new Student[1000];

    public static void registerStudents() throws IOException {
        Student student;
        boolean valid = false;
        int[] marksArr = new int[6];
        System.out.println("Enter details for a new student :");
        System.out.print("Name : ");
        String name = br.readLine();
        System.out.print("Nickname : ");
        String nickName = br.readLine();
        System.out.println("Enter marks for 6 subjects (or less, defaults to 0) :");

        do {
            try {
                for (int i = 0; i < 6; i++) {
                    System.out.print("Subject " + (i + 1) + " : ");
                    marksArr[i] = (Integer.parseInt(br.readLine()));
                }
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid number!");
            }
        } while (!valid);

        System.out.print("Enter address 1 : ");
        String address1 = br.readLine();
        System.out.print("Enter address 2 : ");
        String address2 = br.readLine();
            
        if (address1.isEmpty() || address2.isEmpty()) {
            student = new Student(name, nickName, marksArr, address1);
        } else {
            student = new Student(name, nickName, marksArr, address1, address2);
        }
        studentArr[Student.getStudentCount() - 1] = student;
    }

    public static void displayStudents() {

        System.out.println("All Students : ");
        System.out.println("Total Students Count : " + Student.getStudentCount());
        for (int i = 0; i < Student.getStudentCount(); i++) {
            studentArr[i].display();
        }

        System.out.println("\nMean Marks : ");
        for (int i = 0; i < 6; i++) {
            System.out.println(
                    "Subject " + (i + 1) + " : " + Student.getEachSubjectsTotal()[i] / Student.getStudentCount());
        }

        System.out.println("\nStudent with the highest GPA : ");
        for (int i = 0; i < Student.getStudentCount(); i++) {
            if (studentArr[i].getGpa() == Student.getHighestGpa()) {
                studentArr[i].display();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String flag;
        do {
            registerStudents();
            System.out.print("Do you want to enter another student? (yes/no) : ");
            flag = br.readLine();
        } while (flag.equalsIgnoreCase("yes"));
        displayStudents();
    }

}
