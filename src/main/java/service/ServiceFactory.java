package service;

import repository.Repository;
import repository.impl.EmployeeRepository;
import service.find.RepositoryFinder;
import service.handle.Handler;
import service.handle.HandlerKey;
import service.handle.HandlerSingletoneFactory;
import service.sort.sorter.SortFactory;
import service.sort.sorter.SortKey;
import service.sort.sorter.Sorter;
import service.team.TeamDirector;


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
