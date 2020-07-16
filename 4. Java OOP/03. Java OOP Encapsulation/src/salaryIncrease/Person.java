package salaryIncrease;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.setSalary(salary);
        //this.salary = salary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva",
                this.getFirstName(), this.getLastName(), this.getSalary());
    }

    public void increaseSalary(double bonusPercentage) {
        double baseBonus = this.getSalary() * bonusPercentage / 100;
        if (this.getAge() < 30) {
            this.setSalary(this.getSalary() + baseBonus / 2);
        } else {
            this.setSalary(this.getSalary() + baseBonus);
        }
    }
}









