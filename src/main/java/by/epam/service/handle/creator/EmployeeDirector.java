package by.epam.service.handle.creator;

import by.epam.service.handle.creator.impl.Builder;
import by.epam.service.handle.creator.impl.DeveloperBuilder;
import by.epam.service.handle.creator.impl.TesterBuilder;
import java.util.HashMap;
import java.util.Map;

public class EmployeeDirector {
    private Map<String, Builder> builderMap;

    public static EmployeeDirector getInstance(){
        return SingletononeHolder.director;
    }

    public Builder direct(String kind){
        return builderMap.get(kind);
    }

    private EmployeeDirector(){
        builderMap = new HashMap<>();
        builderMap.put("developer", new DeveloperBuilder());
        builderMap.put("tester", new TesterBuilder());
    }

    static class SingletononeHolder{
        static EmployeeDirector director;
        static {director = new EmployeeDirector();}
    }
}
