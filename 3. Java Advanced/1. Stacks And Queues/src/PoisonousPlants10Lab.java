import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class PoisonousPlants10Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] plants = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();
        int[] days = new int[n];

        ArrayDeque<Integer> prevPlants = new ArrayDeque<>();

        prevPlants.push(0);
        for (int i = 1; i < plants.length; i++) {
            int day = 0;
            int part1 = plants[prevPlants.peek()];
            int part2 = plants[i];
            while (!prevPlants.isEmpty() && plants[prevPlants.peek()] >= plants[i]) {
                int prevPlantValue = prevPlants.pop();
                int prevPlantDay = days[prevPlantValue];
                day = Math.max(day, prevPlantDay);
            }
            if (!prevPlants.isEmpty()) {
                days[i] = day + 1;
            }
            prevPlants.push(i);
        }
        System.out.println(Arrays.stream(days)
                        .max()
                        .getAsInt());
    }
}

/*
//100
import java.net.Inet4Address;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class PoisonousPlants10Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] plants = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .toArray();
        int[] days = new int[n];

        ArrayDeque<Integer> prevPlants = new ArrayDeque<>();

        prevPlants.push(0);
        for (int i = 1; i < plants.length; i++) {
            int day = 0;

            while (!prevPlants.isEmpty() && plants[prevPlants.peek()] >= plants[i]){
                day = Math.max(day, days[prevPlants.pop()]);

            }
            if(!prevPlants.isEmpty()){
                days[i] = day + 1;
            }

            prevPlants.push(i);
        }
        System.out.println(
                Arrays.stream(days)
                .max()
                .getAsInt()
        );

    }
}

 */
