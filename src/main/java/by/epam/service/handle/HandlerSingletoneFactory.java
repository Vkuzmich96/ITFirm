package by.epam.service.handle;

import by.epam.service.handle.creator.EmployeeDirector;
import by.epam.service.handle.impl.FileHandleService;
import by.epam.service.handle.parser.Parser;
import by.epam.service.handle.parser.ParserKey;
import by.epam.service.handle.parser.ParserSingletoneFactory;
import by.epam.service.handle.validator.Validator;
import by.epam.service.handle.validator.ValidatorKey;
import by.epam.service.handle.validator.ValidatorSingletoneFactory;

import java.util.HashMap;
import java.util.Map;

public class HandlerSingletoneFactory {
    private Map<HandlerKey, Handler> handlerMap;
    private Parser parser;
    private ParserSingletoneFactory parserFactory;
    private Validator validator;
    private ValidatorSingletoneFactory validatorFactory;
    private EmployeeDirector director;

    public static HandlerSingletoneFactory getInstance() {
        return HandlerSingletoneFactory.SingletononeHolder.factory;
    }

    public Handler getHandler (HandlerKey key) {
        return handlerMap.get(key);
    }

    private HandlerSingletoneFactory() {
        handlerMap = new HashMap<>();
        parserFactory = ParserSingletoneFactory.getInstance();
        validatorFactory = ValidatorSingletoneFactory.getInstance();
        director = EmployeeDirector.getInstance();
        startFactory();
        handlerMap.put(HandlerKey.FILE_HANDLER, new FileHandleService(parser, validator, director));
    }

    private void startFactory(){
        parser = parserFactory.getParser(ParserKey.FILE_PARSER);
        validator = validatorFactory.getValidator(ValidatorKey.FILE_VALIDATOR);
    }

    static class SingletononeHolder {
        static HandlerSingletoneFactory factory;
        static {
            factory = new HandlerSingletoneFactory();
        }
    }
}
