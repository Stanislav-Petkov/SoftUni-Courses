import java.util.Scanner;

public class BonusScore3106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;
        if (a % 2 == 0) {
            bonusPoints = 1;
        } else if (a % 5 == 0) {
            bonusPoints = 2;
        }
        if (a <= 100) {
            bonusPoints += 5;
        } else if (a > 100 && a < 1000) {
            bonusPoints += a * 0.2;
        } else if (a > 1000) {
            bonusPoints += a * 0.1;
        }
        System.out.println(bonusPoints);
        System.out.println(a + bonusPoints);
    }
}
