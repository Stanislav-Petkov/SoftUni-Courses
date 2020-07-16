package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListGenerator listGenerator = new ListGenerator();
        List<String> list = (List.of("Alice11", "Bobo22"));
        if (list instanceof ArrayList) {
            System.out.println("I am array list");
        } else if (list instanceof LinkedList) {
            System.out.println("I am linked list");
        } else {
            System.out.println(list.getClass());
        }
    }

    private static void printElementsOfArrayList(Iterable<String> list) {
        list.forEach(e -> System.out.println(e));
    }

}
