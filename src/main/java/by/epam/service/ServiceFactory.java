package by.epam.service;

import by.epam.repository.Repository;
import by.epam.repository.impl.EmployeeRepository;
import by.epam.service.find.RepositoryFinder;
import by.epam.service.handle.Handler;
import by.epam.service.handle.HandlerKey;
import by.epam.service.handle.HandlerSingletoneFactory;
import by.epam.service.sort.sorter.SortFactory;
import by.epam.service.sort.sorter.SortKey;
import by.epam.service.sort.sorter.Sorter;
import by.epam.service.team.TeamDirector;


public class ServiceFactory {
    private static final ServiceFactory factory = new ServiceFactory();
    public static ServiceFactory getInstance(){
        return factory;
    }
    private Repository repository = EmployeeRepository.getInstance();
    private RepositoryFinder finder = new RepositoryFinder(repository);
    private Handler handler = HandlerSingletoneFactory.getInstance().getHandler(HandlerKey.FILE_HANDLER);
    private Sorter sorter = SortFactory.getInstance().getSorter(SortKey.INSERT);
    private TeamDirector teamDirector= new TeamDirector(finder,sorter);

    public GeneralService getGeneralService(){
        return new GeneralService(finder,handler,sorter,teamDirector,repository);
    }
}
