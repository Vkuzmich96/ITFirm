package by.epam.service.team;

import by.epam.service.find.RepositoryFinder;
import by.epam.service.sort.sorter.Sorter;
import by.epam.service.team.ext.Var1TeamCreator;

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
