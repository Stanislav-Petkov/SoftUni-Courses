package Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Bulgarian("Pesho"));
        persons.add(new European("Pesho"));
        persons.add(new Chinese("Pesho"));
        for (Person person : persons) {
            print(person);
        }
    }

    private static void print(Person person) {
        if(person instanceof BasePerson){
            ((Bulgarian) person).getName();
        }
        System.out.println(person.sayHello());
    }
}
