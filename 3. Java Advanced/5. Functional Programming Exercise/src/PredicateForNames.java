import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num = Integer.parseInt(scanner.nextLine());
        System.out.println(Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .filter(name -> name.length() <= num)
                .collect(Collectors.joining(System.lineSeparator())));
    }
}

