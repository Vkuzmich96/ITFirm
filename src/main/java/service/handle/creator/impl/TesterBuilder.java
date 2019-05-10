package service.handle.creator.impl;

import entity.Employee;
import entity.tester.*;
import service.ServiceException;

public class TesterBuilder extends Builder{

    private final int POSITION_ARGUMENT = 1;
    private final int TESTING_KIND_ARGUMENT = 2;

    @Override
    public Employee create(String[] strings) throws ServiceException {
        switch (strings[POSITION_ARGUMENT]){
            case "junior":
                return build(new JuniorTester(), strings);
            case "middle":
                return build(new MiddleTester(), strings);
            case "senior":
                return build(new SeniorTester(), strings);
            case "lead":
                return build(new TeamLeadTester(), strings);
            default:
                throw new ServiceException("builder can not create employee with position  " + strings[POSITION_ARGUMENT]);
        }
    }

    private Tester build(Tester tester, String[] strings){
        super.build(tester, strings);
        tester.setTestingKind(
                "automatic".equals(strings[TESTING_KIND_ARGUMENT]) ? TestingKind.AUTOMATIC : TestingKind.BY_HAND
        );
        return tester;
    }
}
