package service.team;

import service.find.RepositoryFinder;
import service.sort.sorter.Sorter;
import service.team.ext.Var1TeamCreator;

import java.util.HashMap;
import java.util.Map;

public class TeamDirector {
    private RepositoryFinder finder;
    private Sorter sorter;
    private Map<TeamKey, TeamCreator> teamMap = new HashMap<>();

    public TeamDirector(RepositoryFinder finder, Sorter sorter){
        this.finder = finder;
        this.sorter = sorter;
        teamMap.put(TeamKey.VAR_1, new Var1TeamCreator(finder, sorter));
    }

    public TeamCreator direct(TeamKey key){
        return teamMap.get(key);
    }
}
