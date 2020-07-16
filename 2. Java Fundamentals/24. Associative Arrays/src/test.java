import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.asList("1234", "camelCase", "PascalCase");
        words.stream()
                .filter(x -> x.length() > 7)
                .map(x -> x.toLowerCase())
                .forEach(x -> System.out.print(x + " "));
    }

    private static <T> List<T> filter(List<T> numbers, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : result) {
            boolean isValid = predicate.test(t);
            if (isValid) {
                result.add(t);
            }
        }
        return result;
    }
}