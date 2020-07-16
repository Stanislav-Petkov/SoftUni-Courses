package militaryElite6.entities;

import militaryElite6.interfaces.Mission;

public class MissionImpl implements Mission {

    public enum Status {
        IN_PROGRESS,
        FINISHED
    }

    private String codeName;
    private Status status;

    public MissionImpl(String codeName, Status status) {
        this.codeName = codeName;
        this.status = status;
    }

    @Override
    public void completeMission() {
        this.status = Status.FINISHED;
    }

    @Override
    public String toString() {
        return String.format("Code Name: " + this.codeName + " State: inProgress");
    }
}
