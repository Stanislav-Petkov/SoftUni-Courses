package opinion_pole;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            if (age > 30) {
                Person person = new Person(name, age);
                people.add(person);
            }
        }
        people.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).forEach(e -> System.out.println(e));
    }
}

