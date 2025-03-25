package entities;

import java.util.*;

public class Extern extends Employee {
    private static final double EXTERN_SALARY = 3500.0;

    public Extern(int id, String name, String jobName, double cotisation, Date endOfContract) {
        super(id, name, jobName, EXTERN_SALARY, cotisation, endOfContract);
    }

    @Override
    public String toString() {
        return "Extern{" +
                "endOfContract=" + endOfContract +
                ", cotisation=" + cotisation +
                ", salary=" + salary +
                ", jobName='" + jobName + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
