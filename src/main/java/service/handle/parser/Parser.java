package service.handle.parser;

import service.ServiceException;

import java.util.List;

public interface Parser {
    List<String[]> parse(String path) throws ServiceException;
}
