package entity.developer;

import entity.Employee;
import entity.Position;
import entity.Salary;

public class MiddleDeveloper extends Employee {

    public MiddleDeveloper(String name, int experience) {
        super(Salary.MIDDLE_DEVELOPER_SALARY, Position.MIDDLE, name, experience);
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
