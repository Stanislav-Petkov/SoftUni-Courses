package BarFoo;

import java.util.ArrayList;

public class Main {
    private static Foo ref = new Bar();

    public static void main(String[] args) {
        ref = new Baz();
        ref.printSomeStuff();
    }

    private static void printElementsOfArrayList(ArrayList<String> list) {
        list.forEach(e -> System.out.println(e));
    }
}





















