package service.find.specification.impl;

import entity.Employee;
import service.find.specification.Specification;

public class FindBySalarySpecification implements Specification<Employee> {
    private int from;
    private int until;

    public FindBySalarySpecification(int from, int until) {
        this.from = from;
        this.until = until;
    }

    @Override
    public boolean match(Employee bean) {
        int salary = bean.getSalary();
        return salary>from&&salary<until;
    }
}
