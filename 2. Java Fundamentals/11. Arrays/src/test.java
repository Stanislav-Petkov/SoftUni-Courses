import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {5, 60, 19, 13, 4};
        int minDist = Math.abs(numbers[0] - numbers[1]);
        for (int firstIndex = 0; firstIndex < numbers.length - 1; firstIndex++) {
            int first = numbers[firstIndex];
            for (int secondIndex = firstIndex + 1; secondIndex < numbers.length; secondIndex++) {
                int second = numbers[secondIndex];
                int distance = Math.abs(first - second);
                if (distance < minDist) {
                    minDist = distance;
                }
            }
        }
        System.out.println(minDist);
    }
}

