package Tuple10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        Tuple<String, String> tuple = new Tuple<>(arr[0] + " " + arr[1], arr[2]);

        String[] nameLiters = scanner.nextLine().split(" ");
        Tuple<String, Integer> tuple1 = new Tuple<>(nameLiters[0], Integer.parseInt(nameLiters[1]));

        String[] intDouble = scanner.nextLine().split(" ");
        Tuple<Integer, Double> tuple2 = new Tuple<>(Integer.parseInt(intDouble[0]), Double.parseDouble(intDouble[1]));

        System.out.println(tuple.getItem1() + " -> " + tuple.getItem2());
        System.out.println(tuple1.getItem1() + " -> " + tuple1.getItem2());
        System.out.println(tuple2.getItem1() + " -> " + tuple2.getItem2());
    }
}
