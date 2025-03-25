package entities;

import java.util.*;

public class Employee {
    protected final int id;
    protected final String name;
    protected final String jobName;
    protected final double salary;
    protected final double cotisation;
    protected final Date endOfContract;

    public Employee(int id, String name, String jobName, double salary, double cotisation, Date endOfContract) {
        this.id = id;
        this.name = name;
        this.jobName = jobName;
        this.salary = salary;
        this.cotisation = cotisation;
        this.endOfContract = endOfContract;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", jobName='" + jobName + '\'' +
                ", salary=" + salary +
                ", cotisation=" + cotisation +
                ", endOfContract=" + endOfContract +
                '}';
    }
}
