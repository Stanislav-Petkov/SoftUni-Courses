package order_by_age;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static class OrderByAge {
        private String name;
        private String id;
        private int age;

        OrderByAge(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public Integer getAge() {
            return this.age;
        }

        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<OrderByAge> orderList = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        while (!input[0].equals("End")) {
            String name = input[0];
            String id = input[1];
            int age = Integer.parseInt(input[2]);
            OrderByAge orderByAge = new OrderByAge(name, id, age);
            orderList.add(orderByAge);
            input = scanner.nextLine().split(" ");
        }
        orderList.stream().sorted((p1, p2) -> p1.getAge() - p2.getAge()).forEach(e -> System.out.println(e));
    }
}
