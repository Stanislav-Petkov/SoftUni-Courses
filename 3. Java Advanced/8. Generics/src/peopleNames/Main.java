package peopleNames;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> peopleNames = new ArrayList<>();
        peopleNames.add("Bob");
        String name = (String) peopleNames.get(0);
        System.out.println(peopleNames);
        System.out.println(name);
        System.out.println("name length" + name.length());
    }
}
