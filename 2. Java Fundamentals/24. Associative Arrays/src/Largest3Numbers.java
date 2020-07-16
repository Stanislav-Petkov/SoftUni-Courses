import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());
        int i = 0;
        while (!nums.isEmpty() && i < 3) {
            if (i == nums.size()) {
                break;
            }
            System.out.print(nums.get(i) + " ");
            i++;
        }
    }
}

