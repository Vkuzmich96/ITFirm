package service.validator;

import service.validator.impl.DataTypesValidConditions;
import service.validator.impl.FileValidator;
import java.util.HashMap;
import java.util.Map;

public class ValidatorSingletoneFactory {
    private Map<ValidatorKey, Validator> parserMap;

    public static ValidatorSingletoneFactory getInstance(){
        return ValidatorSingletoneFactory.SingletoneHolder.factory;
    }

    public Validator getValidator(ValidatorKey validatorKey) {
        return parserMap.get(validatorKey);
    }

    private ValidatorSingletoneFactory(){
        parserMap = new HashMap<>();
        parserMap.put(ValidatorKey.FILE_VALIDATOR, new FileValidator(6, new DataTypesValidConditions()));
    }

    private static class SingletoneHolder {
        private static ValidatorSingletoneFactory factory;
        static {
            factory = new ValidatorSingletoneFactory();
        }
    }
}
