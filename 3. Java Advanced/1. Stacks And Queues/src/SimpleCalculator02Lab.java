import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SimpleCalculator02Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(Integer.parseInt(input[0]));
        for (int i = 1; i < input.length; i++) {
            String operation = input[i];
            int secondNum = Integer.parseInt(input[++i]);
            if ("+".equals(operation)) {
                int result = stack.pop() + secondNum;
                stack.push(result);
            } else if ("-".equals(operation)) {
                int result = stack.pop() - secondNum;
                stack.push(result);
            }
        }
        System.out.println(stack.pop());

    }
}

