package entity;

public enum Salary {
    JUNIOR_DEVELOPER_SALARY(300),
    MIDDLE_DEVELOPER_SALARY(1000),
    SENIOR_DEVELOPER_SALARY(2000),
    TEAM_LEAD_DEVELOPER_SALARY(5000),
    JUNIOR_TESTER_SALARY(200),
    MIDDLE_TESTER_SALARY(500),
    SENIOR_TESTER_SALARY(1000),
    TEAM_LEAD_TESTER_SALARY(2500),
    MANAGER(3000);

    Salary(int salary){
        this.salary = salary;
    }

    int salary;
}
