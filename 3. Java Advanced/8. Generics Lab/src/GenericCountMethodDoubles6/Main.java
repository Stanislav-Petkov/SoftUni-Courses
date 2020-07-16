package GenericCountMethodDoubles6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Box<Double>> boxes = new ArrayList<>();
        while (n-- > 0) {
            Double line = Double.parseDouble(scanner.nextLine());
            boxes.add(new Box<>(line));
        }
        Double element = Double.parseDouble(scanner.nextLine());
        int result = getBiggerElement(boxes, new Box<>(element));
        System.out.println(result);

    }

    private static <T extends Comparable<T>> int getBiggerElement(
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
