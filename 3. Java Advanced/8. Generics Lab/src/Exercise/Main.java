package Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(7, 9, 5, 2, 1));
        List<Double> floats = new ArrayList<>(Arrays.asList(7.0D, 6.0D, 2.0D, 4D, 5.0D));

        int minInteger = min(integers);
        double minDouble = min(floats);

        System.out.println(minInteger);
        System.out.println(minDouble);
    }

    private static <T extends Comparable<T>> T min(List<T> numbers) {
        T min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i).compareTo(min) < 0) {
                min = numbers.get(i);
            }
        }
        return min;
    }
}