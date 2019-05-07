package entity.tester;

import entity.Position;

public class MiddleTester extends Tester {

    public MiddleTester(String name, int experience, int Salary, TestingKind testingKind, int id ) {
        super(Salary, Position.MIDDLE, name, experience, testingKind, id);
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
        return  "MiddleTester{ " + '\'' +
                super.toString() +
                " }"
                ;
    }
}
