import entities.Employee;
import models.EmployeeModel;

public class EmployeeApplication {
    public static void main(String[] args) {
        EmployeeModel model = new EmployeeModel();

        model.readFile();

        for (Employee employee : model.getEmployees()) {
            System.out.println(employee);
        }
    }
}
