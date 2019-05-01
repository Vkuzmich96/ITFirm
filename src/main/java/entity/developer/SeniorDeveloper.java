package entity.developer;

import entity.Employee;
import entity.Position;
import entity.Salary;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(String name, int experience) {
        super(Salary.SENIOR_DEVELOPER_SALARY, Position.SENIOR, name, experience);
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
