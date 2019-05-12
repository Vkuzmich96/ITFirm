package by.epam.service.handle.creator;

import by.epam.entity.Employee;
import by.epam.service.ServiceException;

public interface Creator {
    Employee create (String[] strings) throws ServiceException;
}
