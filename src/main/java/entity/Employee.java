package entity;


import java.util.Objects;

public abstract class Employee {
    private String name;
    private int experience;
    private Salary salary;
    private Position position;

    public Employee(Salary salary, Position position, String name, int  experience) {
        this.salary = salary;
        this.position = position;
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return experience == employee.experience &&
                salary == employee.salary &&
                Objects.equals(name, employee.name) &&
                position == employee.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, experience, salary, position);
    }
}
