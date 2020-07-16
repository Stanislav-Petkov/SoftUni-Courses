package militaryElite6.interfaces;


import java.util.Collection;

public interface Commando extends Private {

    public void addMission(Mission mission);

    public Collection<Mission> getMissions();
}
