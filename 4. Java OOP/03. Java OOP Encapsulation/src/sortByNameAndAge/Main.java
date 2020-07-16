package sortByNameAndAge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Person1> people = new ArrayList<>();

        PersonParser1 personParser = new PersonParser1();
        for (int i = 0; i < n; i++) {
            String input = reader.readLine();
            people.add(PersonParser1.personFrom(input));
        }

        Collections.sort(people, new PersonComparator1());

        for (Person1 person : people) {
            System.out.println(person.toString());
        }
    }
}

