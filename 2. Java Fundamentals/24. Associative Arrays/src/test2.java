import java.util.stream.Collectors;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((a, b) -> b.compareTo(a))
                .limit(3)
                .collect(Collectors.toList());
        for (Integer num : nums) {
            System.out.println(num);
        }
    }
}
