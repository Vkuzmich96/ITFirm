package service.handle.impl;

import entity.Employee;
import service.ServiceException;
import service.handle.Handler;
import service.handle.creator.Creator;
import service.handle.creator.EmployeeDirector;
import service.handle.parser.Parser;
import service.handle.validator.ValidationResult;
import service.handle.validator.Validator;

import java.util.ArrayList;
import java.util.List;

public class FileHandleService implements Handler {
    private Parser parser;
    private Validator validator;
    private Creator creator;
    private EmployeeDirector director;
    private final int KIND_EMPLOYEE_ARGUMENT = 0;

    public FileHandleService(Parser parser, Validator validator, EmployeeDirector director) {
        this.parser = parser;
        this.validator = validator;
        this.director = director;
    }

    @Override
    public List<Employee> handle(String path) throws ServiceException {
        List<String[]> stringList = parser.parse(path);
        ValidationResult result = validator.valid(stringList);
        List<Employee> employees ;
        if (result.isValid()){
            employees = transform(stringList);
        } else {
            employees =  new ArrayList<>();
        }
        return employees;
    }

    private List<Employee> transform( List<String[]> stringList) throws ServiceException {
        List<Employee> employees = new ArrayList<>();
        for (String[] strings: stringList){
            creator = director.direct(strings[KIND_EMPLOYEE_ARGUMENT]);
            employees.add(creator.create(strings));
        }
        return employees;
    }

}
