package utils;

import entities.Employee;
import entities.Extern;
import entities.Intern;
import exception.UnknownEmployeeTypeException;

import java.util.*;

public class EmployeeFactory {
    public static Employee makeEmployee(String type, int id, String name, String jobName, double cotisation, Date endOfContract, double salary) {
        switch (type) {
            case "extern":
                return new Extern(id, name, jobName, cotisation, endOfContract);
            case "intern":
                return new Intern(id, name, jobName, salary, endOfContract);
            case "employee":
                return new Employee(id, name, jobName, salary, cotisation, endOfContract);
            default:
                throw new UnknownEmployeeTypeException(type);
        }
    }
}
