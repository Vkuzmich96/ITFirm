package entity.developer;

import entity.Employee;
import entity.Position;
import entity.Salary;

public class TeamLeadDeveloper extends Employee {
    public TeamLeadDeveloper(String name, int experience) {
        super(Salary.TEAM_LEAD_DEVELOPER_SALARY, Position.TEAM_LEAD, name, experience);
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
