package entity.developer;

import entity.Position;

public class TeamLeadDeveloper extends Developer {
    public TeamLeadDeveloper(String name, int experience, int Salary, String language, int id) {
        super(Salary, Position.TEAM_LEAD, name, experience, language, id);
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
        return  "TeamLeadDeveloper{ " + '\'' +
                super.toString() +
                " }"
                ;
    }
}
