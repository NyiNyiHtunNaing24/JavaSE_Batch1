package Assignment_4.model;

public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, double basicSalary, int hoursWorked, double hourlyRate) {
        super(name,basicSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return (this.hoursWorked * this.hourlyRate);
    }
}
