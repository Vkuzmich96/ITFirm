package entity.manager;

import entity.Employee;
import entity.Position;
import entity.Salary;

public class Manager extends Employee {

    public Manager(String name, int experience) {
        super(Salary.MANAGER, Position.MANAGER, name, experience);
    }
}
