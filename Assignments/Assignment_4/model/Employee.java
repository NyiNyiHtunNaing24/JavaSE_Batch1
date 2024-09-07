package Assignment_4.model;

public class Employee {
    
    private String name;
    private int employeeId;
    private double basicSalary;
    private static Employee empArr[] = new Employee[1000];
    private static int empCount = 0;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
        empCount++;
    }
}
