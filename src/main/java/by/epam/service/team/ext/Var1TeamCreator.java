package by.epam.service.team.ext;

import by.epam.entity.Employee;
import by.epam.entity.Kind;
import by.epam.entity.Position;
import by.epam.entity.Team;
import by.epam.service.find.RepositoryFinder;
import by.epam.service.sort.sorter.Sorter;
import by.epam.service.team.TeamCreator;

import java.util.ArrayList;
import java.util.List;

public class Var1TeamCreator extends TeamCreator {

    private final int JUNIOR_DEVELOPER_QUANTITY = 2;
    private final int MIDDLE_DEVELOPER_QUANTITY = 2;
    private final int LEAD_DEVELOPER_QUANTITY = 1;
    private final int JUNIOR_TESTER_QUANTITY = 2;

    public Var1TeamCreator(RepositoryFinder finder, Sorter sorter) {
        super(finder, sorter);
    }

    @Override
    public Team create() {
        List<Employee> employees = new ArrayList<>();
        super.addEmployees(employees, Kind.DEVELOPER,  Position.JUNIOR, JUNIOR_DEVELOPER_QUANTITY);
        super.addEmployees(employees, Kind.DEVELOPER,  Position.MIDDLE, MIDDLE_DEVELOPER_QUANTITY);
        super.addEmployees(employees, Kind.DEVELOPER,  Position.TEAM_LEAD, LEAD_DEVELOPER_QUANTITY);
        super.addEmployees(employees, Kind.TESTER,  Position.JUNIOR, JUNIOR_TESTER_QUANTITY);
        return new Team(employees);
    }

}
