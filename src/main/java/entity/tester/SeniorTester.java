package entity.tester;

import entity.Position;

public class SeniorTester extends Tester {

    public SeniorTester(String name, int experience, int Salary, TestingKind testingKind, int id) {
        super(Salary, Position.SENIOR, name, experience, testingKind, id);
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
        return  "SeniorTester{ " + '\'' +
                super.toString() +
                " }"
                ;
    }
}
