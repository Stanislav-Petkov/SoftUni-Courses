package salaryIncrease;

public class PersonParser {

    public Person parseFrom(String line) {
        String[] tokens = line.split("\\s+");
        String firstName = tokens[0];
        String lastName = tokens[1];
        int age = Integer.valueOf(tokens[2]);
        double salary = Double.valueOf(tokens[3]);
        return new Person(firstName, lastName, age, salary);
    }
}
