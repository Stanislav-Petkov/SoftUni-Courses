import java.util.Scanner;

public class CharityCampaignExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int confectioner = Integer.parseInt(scanner.nextLine());
        int cake = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancake = Integer.parseInt(scanner.nextLine());
        double totalCake = (cake * 45) * confectioner;
        double totalWaffles = (waffles * 5.8) * confectioner;
        double totalPancake = (pancake * 3.2) * confectioner;
        double total = (totalCake + totalWaffles + totalPancake) * days;
        double money = total - (0.125 * total);
        System.out.printf("%.2f", money);
    }
}
