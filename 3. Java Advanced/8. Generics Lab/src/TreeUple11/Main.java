package TreeUple11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        Tuple<String, String, String> tuple = new Tuple<>(arr[0] + " " + arr[1], arr[2], arr[3]);

        String[] nameLiters = scanner.nextLine().split(" ");
        Tuple<String, Integer, Boolean> tuple1 = new Tuple<>(nameLiters[0], Integer.parseInt(nameLiters[1])
                , Boolean.parseBoolean(nameLiters[2]));

        String[] nameAccountBank = scanner.nextLine().split(" ");
        Tuple<String, Double, String> tuple2 = new Tuple<>(nameAccountBank[0], Double.parseDouble(nameAccountBank[1]),
                nameAccountBank[2]);

        System.out.println(tuple.getItem1() + " -> " + tuple.getItem2() + " -> " + tuple.getItem3());
        System.out.println(tuple1.getItem1() + " -> " + tuple1.getItem2() + " -> " + tuple1.getItem3());
        System.out.println(tuple2.getItem1() + " -> " + String.format("%.01f", tuple2.getItem2()) + " -> " + tuple2.getItem3());
    }
}
