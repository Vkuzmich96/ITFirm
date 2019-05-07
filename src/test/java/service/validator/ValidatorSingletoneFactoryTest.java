package service.validator;

import org.junit.Assert;
import org.junit.Test;
import service.validator.impl.FileValidator;

import static org.junit.Assert.*;

public class ValidatorSingletoneFactoryTest {
    private ValidatorSingletoneFactory factory = ValidatorSingletoneFactory.getInstance();
    @Test
    public void getInstance() {
        Assert.assertNotNull(factory);
    }

    @Test
    public void getValidator() {
        Validator validator = factory.getValidator(ValidatorKey.FILE_VALIDATOR);
        Assert.assertNotNull(validator);
    }
}