package service.sort.comparator;

import entity.Employee;

import java.util.Comparator;

public class ExperienceComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getExperience(), o2.getExperience());
    }
}
