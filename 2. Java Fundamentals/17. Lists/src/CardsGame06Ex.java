
import java.util.List;
import java.util.Scanner;

public class CardsGame06Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        String[] firstInput = scanner.nextLine().split(" ");
        String[] secondInput = scanner.nextLine().split(" ");
        for (int i = 0; i < firstInput.length; i++) {
            first.add(Integer.parseInt(firstInput[i]));
        }
        for (int i = 0; i < secondInput.length; i++) {
            second.add(Integer.parseInt(secondInput[i]));
        }
        int sumFirst = 0;
        int sumSecond = 0;
        int position = 0;
        while (first.size() > 0 || second.size() > 0) {
            if (first.get(position) < second.get(position)) {
                second.add(second.remove(position));
                second.add(first.remove(position));
            } else if (first.get(position) > second.get(position)) {
                first.add(first.remove(position));
                first.add(second.remove(position));
            } else if (first.get(position) == second.get(position)) {
                first.remove(position);
                second.remove(position);
            }
            if (first.size() == 0 || second.size() == 0) {
                break;
            }
        }
        for (int i = 0; i < first.size(); i++) {
            sumFirst += first.get(i);
        }
        for (int i = 0; i < second.size(); i++) {
            sumSecond += second.get(i);
        }
        if (first.size() == 0) {
            System.out.printf("Second player wins! Sum: %d", sumSecond);
        } else if (second.size() == 0) {
            System.out.printf("First player wins! Sum: %d", sumFirst);
        }
    }
}
