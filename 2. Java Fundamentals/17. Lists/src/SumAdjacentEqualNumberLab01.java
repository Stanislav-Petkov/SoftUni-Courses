import java.util.Scanner;

public class SumAdjacentEqualNumberLab01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 3, 6, 1));
        int i = 0;
        while (i < numbers.size()) {
            if ((numbers.get(i) + numbers.get(i + 1)) == numbers.get(i + 2)) {
                int x = numbers.get(i + 2);
                numbers.remove(i);
                numbers.set(i + 1, x);
            } else {
                i++;
            }
        }
        for (int j = 0; j < numbers.size(); j++) {
            System.out.println(numbers.get(j) + " ");
        }
    }
}
