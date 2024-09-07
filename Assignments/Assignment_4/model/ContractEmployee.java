package Assignment_4.model;

public class ContractEmployee extends Employee {

    private int contractDuration;
    private double contractAmount;

    public ContractEmployee(String name, double basicSalary, int contractDuration,
            double contractAmount) {
        super(name, basicSalary);
        this.contractDuration = contractDuration;
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return (this.contractAmount / this.contractDuration);
    }
}
