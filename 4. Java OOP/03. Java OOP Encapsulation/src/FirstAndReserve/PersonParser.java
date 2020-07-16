package FirstAndReserve;

import java.util.Collections;
import java.util.List;

public class PersonParser {

    public static Person from(String line) {
        String[] tokens = line.split("\\s+");
        String firstName = tokens[0];
        String lastName = tokens[1];
        int age = Integer.valueOf(tokens[2]);
        double salary = Double.valueOf(tokens[3]);
        return new Person(firstName, lastName, age, salary);
    }

    public static void main(String[] args) {
        List<String> list = List.of("Bob", "Charlie");
        List<String> immutableNames = Collections.unmodifiableList(list);
        System.out.println(immutableNames);
        iWillMutateThisList(immutableNames);
        System.out.println(immutableNames);
    }

    public static void iWillMutateThisList(List<String> list) {
        list.set(0, "Alice");
    }
}
