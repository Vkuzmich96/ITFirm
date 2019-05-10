package service.handle;

import service.handle.creator.EmployeeDirector;
import service.handle.impl.FileHandleService;
import service.handle.parser.Parser;
import service.handle.parser.ParserKey;
import service.handle.parser.ParserSingletoneFactory;
import service.handle.validator.Validator;
import service.handle.validator.ValidatorKey;
import service.handle.validator.ValidatorSingletoneFactory;

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
