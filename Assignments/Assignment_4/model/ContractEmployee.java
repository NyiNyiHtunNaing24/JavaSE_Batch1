package Assignment_4.model;

public class ContractEmployee extends Employee {

    private int contractDuration;
    private double contractAmount;

    public ContractEmployee(String name, int employeeId, double basicSalary, int contractDuration,
            double contractAmount) {
        super(name, employeeId, basicSalary);
        this.contractDuration = contractDuration;
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return (this.contractAmount / this.contractDuration);
    }
}
