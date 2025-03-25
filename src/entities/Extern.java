package entities;

import java.util.*;

public class Extern extends Employee {

    public Extern(int id, String name, String phoneNumber, String jobName, double salary, double cotisation, Date endOfContract) {
        super(id, "Externe: " + name, phoneNumber, jobName, salary, cotisation, endOfContract);
    }

    @Override
    public String toString() {
        return "Extern{" +
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
