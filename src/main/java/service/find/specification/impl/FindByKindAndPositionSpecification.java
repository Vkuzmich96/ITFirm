package service.find.specification.impl;

import entity.Employee;
import entity.Kind;
import entity.Position;
import service.find.specification.Specification;

public class FindByKindAndPositionSpecification implements Specification<Employee> {

    private Kind kind;
    private Position position;

    public FindByKindAndPositionSpecification(Kind kind, Position position) {
        this.kind = kind;
        this.position = position;
    }

    @Override
    public boolean match(Employee bean) {
        return kind==bean.getKind()&&position==bean.getPosition();
    }
}
