package models;

import entities.Employee;
import utils.EmployeeFactory;
import utils.FileLineReader;

import java.io.IOException;
import java.util.*;

public class EmployeeModel {
    public static final String EMPLOYEE_FILE = "employee.txt";

    private final List<Employee> employees;

    public EmployeeModel() {
        employees = new ArrayList<>();
    }

    public void readFile() {
        try {
            String[] lines = FileLineReader.readByLines(EMPLOYEE_FILE);

            for (String line : lines) {
                String[] parts = line.split(",");

                try {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String phoneNumber = parts[2];
                    double salary = Double.parseDouble(parts[3]);
                    String jobTitle = parts[5];
                    double cotisation = Double.parseDouble(parts[6]);
                    Date endOfContract = new Date(parts[7]);
                    String type = parts[8];

                    Employee employee = EmployeeFactory.makeEmployee(type, id, name, phoneNumber, salary, endOfContract, cotisation);
                    employees.add(employee);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
