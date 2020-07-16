

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericHashMap<String, Integer> map = new GenericHashMap();
        map.put("Alice", 19);
        map.put("Alice", 22);
        map.put("Zoe", 33);
        System.out.println(map.get("Alice"));

    }
}