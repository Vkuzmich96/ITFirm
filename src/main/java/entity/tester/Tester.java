package entity.tester;

import entity.Employee;
import entity.Kind;
import entity.Position;

public abstract class Tester extends Employee {
    private TestingKind testingKind;
    public Tester(int salary, Position position, String name, int experience, TestingKind testingKind, int id) {
        super(salary, position, name, experience, Kind.TESTER, id);
        this.testingKind = testingKind;
    }

    public TestingKind getTestingKind() {
        return testingKind;
    }

    public void setTestingKind(TestingKind testingKind) {
        this.testingKind = testingKind;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return  "testingKind='" + testingKind + '\''+
                super.toString();
    }
}
