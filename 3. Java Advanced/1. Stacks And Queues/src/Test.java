import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] plants = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] days = new int[n];
        ArrayDeque<Integer> prevPlants = new ArrayDeque<>();

        prevPlants.push(0);
        for (int i = 0; i < plants.length; i++) {
            int day = 0;
            int f = plants[prevPlants.peek()];
            int s = plants[i];
            while (!prevPlants.isEmpty() && plants[prevPlants.peek()] >= plants[i]) {
                int second = prevPlants.pop();
                int first = days[second];
                day = Math.max(day, first);
            }
            if (!prevPlants.isEmpty()) {
                days[i] = day + 1;
            }
            prevPlants.push(i);
        }

        System.out.println(Arrays.stream(days).max().getAsInt());
    }
}
