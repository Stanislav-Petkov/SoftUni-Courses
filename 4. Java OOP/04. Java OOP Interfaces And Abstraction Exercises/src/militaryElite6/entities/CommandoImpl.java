package militaryElite6.entities;

import militaryElite6.enumerations.Corps;
import militaryElite6.interfaces.Commando;
import militaryElite6.interfaces.Mission;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static militaryElite6.enumerations.Corps.AIRFORCES;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private List<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new ArrayList<>();
    }

    @Override
    public void addMission(Mission mission) {
        this.missions.add(mission);
    }

    @Override
    public Collection<Mission> getMissions() {
        return this.missions;
    }

    public String gettCorps() {
        if (super.getCorps().equals(AIRFORCES)) {
            return "Airforces";
        }
        return "Marines";
    }

    @Override
    public String toString() {
        return
                String.format("Name: "
                        + super.getFirstName() + " " +
                        super.getLastName()
                        + " Id: " + super.getId()
                        + " Salary: %.2f"
                        + "%n", super.getSalary()) +
                        String.format("Corps: " + this.gettCorps());
    }
}
