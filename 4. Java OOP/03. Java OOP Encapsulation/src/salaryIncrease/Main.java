package salaryIncrease;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Person> list = new ArrayList<>();
        PersonParser personParser = new PersonParser();
        for (int i = 0; i < n; i++) {
            Person person = personParser.parseFrom(reader.readLine());
            list.add(person);
        }
        int bonus = Integer.parseInt(reader.readLine());
        for (Person person : list) {
            person.increaseSalary(bonus);
            System.out.println(person);
        }
    }
}