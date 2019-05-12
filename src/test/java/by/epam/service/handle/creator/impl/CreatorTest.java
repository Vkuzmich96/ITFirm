package by.epam.service.handle.creator.impl;

import by.epam.entity.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import by.epam.service.ServiceException;
import by.epam.service.handle.creator.Creator;
import by.epam.service.handle.creator.EmployeeDirector;

@RunWith(JUnit4.class)
public class CreatorTest {
    private EmployeeDirector director = EmployeeDirector.getInstance();

    @Test
    public void create() {
        Assert.assertNotNull(director);
    }

    private Creator developerBuilder = director.direct("developer");

    @Test
    public void getDeveloperBuilder(){
        Assert.assertNotNull(developerBuilder);
    }

    private Creator testerBuilder = director.direct("tester");

    @Test
    public void getTesterBuilder(){
        Assert.assertNotNull(testerBuilder);
    }

    private Employee developer;

    @Test
    public void createDeveloper(){
        try {
            developer = developerBuilder.create("developer;junior;java;Vasya;1;350".split(";"));
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(developer);
    }

    private Employee tester;

    @Test
    public void createTester(){
        try {
            tester = testerBuilder.create("tester;junior;hand;Nikita;1;200".split(";"));
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(tester);
    }

}