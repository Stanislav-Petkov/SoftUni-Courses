package militaryElite6.entities;

import militaryElite6.enumerations.Corps;
import militaryElite6.interfaces.SpecialisedSoldier;

public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    private Corps corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary);
        this.corps = corps;
    }

    public Corps getCorps() {
        return this.corps;
    }
}
