import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consumer<String> printer = x -> System.out.println(x);
        Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .forEach(e -> printer.accept(e));
    }
}
