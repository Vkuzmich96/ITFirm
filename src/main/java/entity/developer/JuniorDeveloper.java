package entity.developer;

import entity.Employee;
import entity.Position;
import entity.Salary;

public class JuniorDeveloper extends Employee {

    public JuniorDeveloper(String name, int experience) {
        super(Salary.JUNIOR_DEVELOPER_SALARY, Position.JUNIOR, name, experience);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
