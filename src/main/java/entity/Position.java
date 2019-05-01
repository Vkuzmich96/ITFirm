package entity;

public enum Position {

    JUNIOR("junior"), MIDDLE("middle"), SENIOR("senior"), TEAM_LEAD("teamLead"), MANAGER("manager");

    String positionName;

    Position(String positionName){
        this.positionName = positionName;
    }

    public String getPositionName() {
        return positionName;
    }
}
