package service.parser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import service.parser.impl.FileParser;

import static org.junit.Assert.*;

public class ParserSingletoneFactoryTest {
    private ParserSingletoneFactory parserFactory = ParserSingletoneFactory.getInstance();

    @Test
    public void getInstance() {
        Assert.assertNotNull(parserFactory);
    }

    @Test
    public void getParser(){
        Parser fileParser = parserFactory.getParser(ParserKey.FILE_PARSER);
        Assert.assertNotNull(fileParser);
    }
}