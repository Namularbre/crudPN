package entities;

import java.util.*;

public class Intern extends Employee {

    public static final double COTISATION_SALARY = 0.0;

    public Intern(int id, String name, String phoneNumber, String jobName, double salary, Date endOfContract) {
        super(id, name, phoneNumber, jobName, salary, COTISATION_SALARY, endOfContract);
    }

    @Override
    public String toString() {
        return "Intern{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", jobName='" + jobName + '\'' +
                ", salary=" + salary +
                ", cotisation=" + cotisation +
                ", endOfContract=" + endOfContract +
                '}';
    }
}
