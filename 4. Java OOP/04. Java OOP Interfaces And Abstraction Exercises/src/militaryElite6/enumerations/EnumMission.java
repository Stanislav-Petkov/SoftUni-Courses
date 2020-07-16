package militaryElite6.enumerations;

public enum EnumMission {
    inProgress("inProgress"),
    finished("finished");

    public final String state;

    EnumMission(String state) {
        this.state = state;
    }
}
