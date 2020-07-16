package sortByNameAndAge;

public class PersonParser1 {

    public static Person1 personFrom(String line) {
        String[] split = line.split("\\s+");
        String firstName = split[0];
        String lastName = split[1];
        int age = Integer.valueOf(split[2]);
        return new Person1(firstName, lastName, age);
    }
}
