import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersInput = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Integer divisor = Integer.parseInt(scanner.nextLine());
        List<Integer> newList = new ArrayList<>();


        Collections.reverse(numbersInput);
        numbersInput.stream().filter(n -> n % divisor != 0)
                .forEach(integer -> System.out.print(integer + " "));
    }
}
