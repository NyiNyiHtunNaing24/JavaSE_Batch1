package Assignment_4.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Assignment_4.model.ContractEmployee;
import Assignment_4.model.Employee;
import Assignment_4.model.FullTimeEmployee;
import Assignment_4.model.PartTimeEmployee;

public class EmployeeRegistrationService {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Employee registerEmployee() throws IOException {
        
        String name;
        String type;
        Double basicSalary;

        System.out.print("Enter Employee's Name : ");
        name = br.readLine();
        System.out.print("Enter Basic Salary : ");
        basicSalary = Double.parseDouble(br.readLine());
        System.out.print("Enter the type of Employee(fulltime/parttime/contract) ");
        type = (br.readLine());

        if (type.equalsIgnoreCase("fulltime")) {
            return this.registerFullTimeEmployee(name, basicSalary);
        } else if (type.equalsIgnoreCase("parttime")) {
            return this.registerPartTimeEmployee(name, basicSalary);
        } else if (type.equalsIgnoreCase("contract")) {
            return this.registerContractEmployee(name, basicSalary);
        }

        return null;
    }

    public FullTimeEmployee registerFullTimeEmployee(String name, Double basicSalary)
            throws NumberFormatException, IOException {
        Double allowance;
        Double bonus;
        System.out.print("Enter Allowance : ");
        allowance = Double.parseDouble(br.readLine());
        System.out.print("Enter Bonus : ");
        bonus = Double.parseDouble(br.readLine());
        return new FullTimeEmployee(name, basicSalary, allowance, bonus);
    }

    public PartTimeEmployee registerPartTimeEmployee(String name, Double basicSalary)
            throws NumberFormatException, IOException {
        int hoursWorked;
        double hourlyRate;
        System.out.print("Enter Total Working Hours : ");
        hoursWorked = Integer.parseInt(br.readLine());
        System.out.print("Enter Hourly rate : ");
        hourlyRate = Double.parseDouble(br.readLine());
        return new PartTimeEmployee(name, basicSalary, hoursWorked, hourlyRate);
    }

    public ContractEmployee registerContractEmployee(String name, Double basicSalary)
            throws NumberFormatException, IOException {
        int contractDuration;
        double contractAmount;
        System.out.print("Enter Contract Duration : ");
        contractDuration = Integer.parseInt(br.readLine());
        System.out.print("Enter Contract Amount : ");
        contractAmount = Double.parseDouble(br.readLine());
        return new ContractEmployee(name, basicSalary, contractDuration, contractAmount);
    }
}
