import java.util.Scanner;

public class Shopping02ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double videoCard = Double.parseDouble(scanner.nextLine());
        double processor = Double.parseDouble(scanner.nextLine());
        double ram = Double.parseDouble(scanner.nextLine());
        double videoPrice = videoCard * 250.0;
        double processorPrice = processor * ((0.35) * videoPrice);
        double ramPrice = ram * (0.1 * videoPrice);
        double sum = videoPrice + processorPrice + ramPrice;
        if (videoCard > processor) {
            sum = sum - sum * 0.15;
        }
        if (sum <= budget) {
            System.out.printf("You have %.2f leva left!", budget - sum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", sum - budget);
        }
    }
}
