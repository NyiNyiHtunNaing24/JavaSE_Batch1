package Assignment_4.model;

public class FullTimeEmployee extends Employee {

    private double allowance;
    private double bonus;

    public FullTimeEmployee(String name, int employeeId, double basicSalary, double allowance, double bonus) {
        super(name, employeeId, basicSalary);
        this.allowance = allowance;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return (this.allowance + this.bonus + super.getBasicSalary());
    }
}