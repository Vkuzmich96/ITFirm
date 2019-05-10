package service.handle.creator;

import entity.Employee;
import service.ServiceException;

public interface Creator {
    Employee create (String[] strings) throws ServiceException;
}
