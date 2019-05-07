package service.parser.impl;

import org.junit.Assert;
import org.junit.Test;
import service.ServiceException;

public class FileParserTest {
    private FileParser parser = new FileParser();

    @Test
    public void parse() {
        String path = "TestValues.txt";
        int actual = 0;
        try {
            actual = parser.parse(path).size();
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        int expected = 2;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void split() {
        String path = "TestValues.txt";
        int actual = 0;
        try {
            actual = parser.parse(path).get(0).length;
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        int expected = 5;
        Assert.assertEquals(actual,expected);
    }
}