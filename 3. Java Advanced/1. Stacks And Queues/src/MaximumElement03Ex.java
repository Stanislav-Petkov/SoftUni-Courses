import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement03Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Long> numbers = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String commandType = input[0];
            long value = 0;
            if (commandType.equals("1")) {
                value = Long.parseLong(input[1]);
            }
            switch (commandType) {
                case "1":
                    numbers.push(value);
                    break;
                case "2":
                    numbers.pop();
                    break;
                case "3":
                    long max = numbers.stream().max(Long::compareTo).orElse((long) 0);
                    System.out.println(max);
                    break;
            }
        }
    }
}
