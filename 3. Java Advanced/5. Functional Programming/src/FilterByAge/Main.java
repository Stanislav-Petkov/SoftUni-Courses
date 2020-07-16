package FilterByAge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        doEverything(new Scanner("5\n" +
                "Pesho, 20\n" +
                "Gosho, 18\n" +
                "Mimi, 29\n" +
                "Ico, 31\n" +
                "Simo, 16\n" +
                "older\n" +
                "20\n" +
                "name age\n"));
    }

    private static void doEverything(Scanner scanner) {
        String numberOfPeople = scanner.nextLine().trim();
        int ppl = Integer.parseInt(numberOfPeople);
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < ppl; i++) {
            String[] tokens = scanner.nextLine().split(", ");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            Person person = new Person(age, name);
            personList.add(person);
        }
        String condition = scanner.nextLine().trim();
        int ageCondition = Integer.parseInt(scanner.nextLine().trim());
        String finalCondition = scanner.nextLine();

        Predicate<Person> personPredicate = getPredicate(condition, ageCondition);
        Consumer<Person> personPrinter = getPersonPrinter(finalCondition);
        personList.stream()
                .filter(personPredicate)
                .forEach(personPrinter);
    }

    private static Consumer<Person> getPersonPrinter(String finalCondition) {
        switch (finalCondition) {
            case "name":
                return person -> System.out.println(person.getName());
            case "age":
                return person -> System.out.println(person.getAge());
            default:
                return person -> System.out.println(person.getName() + " - "
                        + person.getAge());
        }
    }

    private static Predicate<Person> getPredicate(String condition, int ageCondition) {
        Predicate<Person> personPredicate;
        if ("younger".equals(condition)) {
            personPredicate = (person) -> person.getAge() <= ageCondition;
        } else {
            personPredicate = (person) -> person.getAge() >= ageCondition;
        }
        return personPredicate;
    }
}

