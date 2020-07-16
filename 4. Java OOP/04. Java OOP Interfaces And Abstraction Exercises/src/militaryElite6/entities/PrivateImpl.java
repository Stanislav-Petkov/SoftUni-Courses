package militaryElite6.entities;

import militaryElite6.interfaces.Private;

public class PrivateImpl extends SoldierImpl implements Private {

    private double salary;

    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("Name: "
                + super.getFirstName() + " " +
                super.getLastName()
                + " Id: " + super.getId()
                + " Salary: %.2f", this.salary);
    }
}
