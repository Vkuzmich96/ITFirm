package service.handle;

import entity.Employee;
import service.ServiceException;

import java.util.List;

public interface Handler {
    List<Employee> handle(String path) throws ServiceException;
}
