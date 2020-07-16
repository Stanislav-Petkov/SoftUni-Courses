import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames01Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num  = Integer.parseInt(scanner.nextLine());
        Set<String> usenames = new LinkedHashSet<>();
        while (num-- > 0){
            String line = scanner.nextLine();
            usenames.add(line);
        }
        usenames.forEach(System.out::println);
    }
}
