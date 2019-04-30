package entity;

import java.util.Objects;

public abstract class Employee {
    private String salary;
    private String position;
    public abstract void work();

    public Employee(String salary, String position) {
        this.salary = salary;
        this.position = position;
    }

    private String getSalary() {
        return salary;
    }

    private String getPosition() {
        return position;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(salary, employee.salary) &&
                Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, position);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary='" + salary + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
