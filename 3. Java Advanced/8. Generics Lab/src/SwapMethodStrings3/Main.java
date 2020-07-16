package SwapMethodStrings3;

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
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        swap(boxes, first, second);
        for (Box<String> box : boxes) {
            System.out.println(box.toString());
        }
    }

    public static <T> void swap(List<T> boxes, int first, int second) {
        T element = boxes.get(first);
        boxes.set(first, boxes.get(second));
        boxes.set(second, element);
    }
}
