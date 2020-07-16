package GenericCountMethodStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Box<String>> boxes = new ArrayList<>();

        while (n-- > 0) {
            String line = scanner.nextLine();
            Box<String> box = new Box<>(line);
            boxes.add(box);
        }
        String element = scanner.nextLine();
        int result = countGreaterElements(boxes, new Box<>(element));
        System.out.println(result);
    }

    //
    private static <T extends Comparable<T>> int countGreaterElements(
            List<Box<T>> boxes, Box<T> element) {
        int count = 0;
        for (Box<T> box : boxes) {
            if (box.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }
}
