package ListWithOnlyAdd;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Alice");
        list.add("Alice");
        System.out.println(list.size());
        list.remove("Alice");
        System.out.println(list.size());
    }
}