import java.util.Scanner;

public class Savings01ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double months = Double.parseDouble(scanner.nextLine());
        double sum = Double.parseDouble(scanner.nextLine());
        double thirty = income * 0.3;
        double savings = income - (sum + thirty);
        System.out.printf("She can save %.2f%%%n", savings / income * 100);
        System.out.printf("%.2f", months * savings);
    }
}
