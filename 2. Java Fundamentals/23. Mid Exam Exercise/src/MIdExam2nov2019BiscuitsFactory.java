import java.util.Scanner;

public class MIdExam2nov2019BiscuitsFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int buiscuitsPerDay = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());
        int buiscuitPerMonth = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        for (int i = 0; i < 30; i++) {
            if (i % 3 == 0) {
                sum += (buiscuitsPerDay * workersCount) * 0.75;
            } else {
                sum += buiscuitsPerDay * workersCount;
            }
        }
        double difference = sum - buiscuitPerMonth;
        double percentage = (difference / buiscuitPerMonth) * 100;
        System.out.printf("You have produced %.0f biscuits for the past month.%n", sum);
        if (difference > 0) {
            System.out.printf("You produce %.2f percent more biscuits.%n", Math.abs(percentage));
        } else if (difference <= 0) {
            System.out.printf("You produce %.2f percent less biscuits.%n", Math.abs(percentage));
        }
    }
}
