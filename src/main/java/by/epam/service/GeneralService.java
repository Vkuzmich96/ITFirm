package by.epam.service;

import by.epam.entity.Employee;
import by.epam.entity.Team;
import by.epam.repository.Repository;
import by.epam.service.find.RepositoryFinder;
import by.epam.service.handle.Handler;
import by.epam.service.sort.comparator.ExperienceComparator;
import by.epam.service.sort.comparator.SalaryComparator;
import by.epam.service.sort.sorter.Sorter;
import by.epam.service.team.TeamDirector;
import by.epam.service.team.TeamKey;

import java.util.List;

public class GeneralService implements Service {

    private RepositoryFinder finder;
    private Handler handler;
    private Sorter sorter;
    private TeamDirector director;
    private Repository repository;

    public GeneralService(RepositoryFinder finder, Handler handler, Sorter sorter, TeamDirector director, Repository repository) {
        this.finder = finder;
        this.handler = handler;
        this.sorter = sorter;
        this.director = director;
        this.repository = repository;
    }

    @Override
    public List<Employee> find(String from, String until) {
        return finder.find(Integer.parseInt(from), Integer.parseInt(until));
    }

    @Override
    public void handle(String path) throws ServiceException {
        repository.addAll(handler.handle(path));
    }

    @Override
    public String sort(String key) {
        switch (key){
            case "salary":
                sorter.sort(repository.get(), new SalaryComparator());
                break;
            case "experience":
                sorter.sort(repository.get(), new ExperienceComparator());
                break;
        }
        return repository.toString();
    }

    @Override
    public String create() {
        Team team = director.direct(TeamKey.VAR_1).create();
        return team.toString()+ '\n' + "Man hours" + team.getManHours();
    }
}
