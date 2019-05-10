package service.team;

import entity.Employee;
import entity.Kind;
import entity.Position;
import entity.Team;
import service.find.RepositoryFinder;
import service.sort.comparator.SalaryComparator;
import service.sort.sorter.Sorter;

import java.util.ArrayList;
import java.util.List;

public abstract class TeamCreator {
    private RepositoryFinder finder;
    private Sorter sorter;

    public TeamCreator(RepositoryFinder finder, Sorter sorter) {
        this.finder = finder;
        this.sorter = sorter;
    }

    public abstract Team create();

    protected void addEmployees(List<Employee> employees, Kind kind, Position position, int quantity){
        List<Employee> finded = finder.find(kind, position);
        sorter.sort(finded, new SalaryComparator());
        employees.addAll(getBestEmployees(finded,quantity));
    }

    private List<Employee> getBestEmployees (List<Employee> employees, int quantity){
        List<Employee> best = new ArrayList<>();
        for (int i = 0; i < employees.size() && i < quantity; i++){
            best.add(employees.get(i));
        }
        return best;
    }
}
