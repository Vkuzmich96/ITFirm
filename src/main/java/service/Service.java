package service;

import entity.Employee;

import java.util.List;

public interface Service {
    List<Employee> find(String from, String until);
    void handle(String path) throws ServiceException;
    String sort(String key);
    String create();
}
