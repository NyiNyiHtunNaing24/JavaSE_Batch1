package Assignment_4.main;

import Assignment_4.model.ContractEmployee;
import Assignment_4.model.Employee;
import Assignment_4.model.FullTimeEmployee;
import Assignment_4.model.PartTimeEmployee;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new FullTimeEmployee("Jhon", 001, 2500, 1000, 500);
        Employee emp2 = new PartTimeEmployee("Sally", 002, 2500, 20, 150);
        Employee emp3 = new ContractEmployee("Harry", 003, 2500, 2, 3000);

        emp1.display();
        emp2.display();
        emp3.display();
    }
}
