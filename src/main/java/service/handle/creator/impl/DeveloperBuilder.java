package service.handle.creator.impl;

import entity.Employee;
import entity.developer.*;
import service.ServiceException;

public class DeveloperBuilder extends Builder {

    private final int POSITION_ARGUMENT = 1;
    private final int LANGUAGE_ARGUMENT = 2;

    @Override
    public Employee create(String[] strings) throws ServiceException {
        switch (strings[POSITION_ARGUMENT]){
            case "junior":
                return build(new JuniorDeveloper(), strings);
            case "middle":
                return build(new MiddleDeveloper(), strings);
            case "senior":
                return build(new SeniorDeveloper(), strings);
            case "lead":
                return build(new TeamLeadDeveloper(), strings);
            default:
                throw new ServiceException("builder can not create employee with position  " + strings[POSITION_ARGUMENT]);
        }
    }

    private Developer build(Developer developer, String[] strings){
        super.build(developer, strings);
        developer.setLanguage(strings[LANGUAGE_ARGUMENT]);
        return developer;
    }


}
