package Assignment_4.model;

public class Employee {
    
    private String name;
    private int employeeId;
    private double basicSalary;

    public Employee(String name, int employeeId, double basicSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return this.basicSalary;
    }

    public void display() {
        System.out.println("Employee     : " + this.name);
        System.out.println("Employee ID  : " + this.employeeId);
        System.out.println("Basic Salary : " + this.basicSalary);
        System.out.println("Total Salary : " + this.calculateSalary());
        System.out.println();
    }

    public double getBasicSalary() {
        return this.basicSalary;
    }
}
