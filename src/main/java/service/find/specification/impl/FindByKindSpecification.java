package service.find.specification.impl;

import entity.Employee;
import entity.Kind;
import service.find.specification.Specification;

public class FindByKindSpecification implements Specification<Employee> {

    private Kind kind;

    public FindByKindSpecification(Kind kind) {
        this.kind = kind;
    }

    @Override
    public boolean match(Employee bean) {
        Kind kind = bean.getKind();
        return this.kind==kind;
    }
}
