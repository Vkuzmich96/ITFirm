package entity;


import java.util.Arrays;

public class Team {

    private Employee[] employees;

    Team(Employee[] employees){
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Team{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }
}
