package person;


import person.inner.Child;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        Child person = new Child(name, age);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
