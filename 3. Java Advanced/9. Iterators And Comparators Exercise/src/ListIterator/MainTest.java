package ListIterator;

import java.util.Arrays;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = Arrays.stream(scanner.nextLine().split(" "))
                .skip(1)
                .map(e -> e.toString())
                .toArray(String[]::new);

        ListIteratorTest listIteratorTest = new ListIteratorTest(tokens);
        String line = scanner.nextLine();
        while (!line.equals("END")) {
            switch (line) {
                case "Move":
                    System.out.println(listIteratorTest.move());
                    break;
                case "Print":
                    try {
                        listIteratorTest.print();
                    } catch (UnsupportedOperationException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "HasNext":
                    System.out.println(listIteratorTest.hasNext());
                    break;
            }
            line = scanner.nextLine();
        }
    }
}
