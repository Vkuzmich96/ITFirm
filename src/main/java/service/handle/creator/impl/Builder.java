package service.handle.creator.impl;
import entity.Employee;
import service.handle.creator.Creator;

import java.util.UUID;

public abstract class Builder implements Creator {

    private final int NAME_ARGUMENT = 3;
    private final int EXPERIENCE_ARGUMENT = 4;
    private final int SALARY_ARGUMENT = 5;

    private int idMaker(){
        return UUID.randomUUID().hashCode();
    }

    protected Employee build(Employee employee, String[] strings) {
        employee.setName(strings[NAME_ARGUMENT]);
        employee.setExperience(Integer.parseInt(strings[EXPERIENCE_ARGUMENT]));
        employee.setSalary(Integer.parseInt(strings[SALARY_ARGUMENT]));
        employee.setId(idMaker());
        return employee;
    }
}
