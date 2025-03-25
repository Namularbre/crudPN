package utils;

import entities.Employee;
import entities.Extern;
import entities.Intern;
import exception.UnknownEmployeeTypeException;

import java.util.*;

/**
 * Un Factory est un deign pattern, tu en as plein ici : <a href="https://refactoring.guru/fr/design-patterns/factory-method">Lien refactoring guru</a>
 * Un design pattern et un pattern fait de classes qui répondent à des problématiques que l'on rencontre souvent en développement et qui permet de respecter
 * de nombreuses conventions pour garder un code propre comme les principes SOLID.
 * Une fois maitrisé, une solution très efficace est brain dead pour concevoir une application.
 */
public class EmployeeFactory {

    /**
     * Génère un employé selon son type.
     * @param type
     * @param id
     * @param name
     * @param jobName
     * @param cotisation
     * @param endOfContract
     * @param salary
     * @return
     */
    public static Employee makeEmployee(String type, int id, String name, String phoneNumber, String jobName, double cotisation, Date endOfContract, double salary) {
        switch (type) {
            case "extern":
                return new Extern(id, name, phoneNumber, jobName, salary, cotisation, endOfContract);
            case "intern":
                return new Intern(id, name, phoneNumber, jobName, salary, endOfContract);
            case "employee":
                return new Employee(id, name, phoneNumber, jobName, salary, cotisation, endOfContract);
            default:
                throw new UnknownEmployeeTypeException(type);
        }
    }
}
