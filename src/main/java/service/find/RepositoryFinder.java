package service.find;

import entity.Employee;
import entity.Kind;
import entity.Position;
import repository.Repository;
import service.find.specification.impl.FindByKindAndPositionSpecification;
import service.find.specification.impl.FindByKindSpecification;
import service.find.specification.impl.FindBySalarySpecification;
import java.util.List;


public class RepositoryFinder {
    private Repository repository;

    public RepositoryFinder(Repository repository){
        this.repository = repository;
    }

    public List<Employee> find(int from, int until){
        return repository.find(new FindBySalarySpecification(from, until));
    }

    public List<Employee> find(Kind kind){
        return repository.find(new FindByKindSpecification(kind));
    }

    public List<Employee> find(Kind kind, Position position){
        return repository.find(new FindByKindAndPositionSpecification(kind, position));
    }
}
