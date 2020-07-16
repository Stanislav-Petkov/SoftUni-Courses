import java.util.Scanner;

public class LunchBreak02ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double epizod = Double.parseDouble(scanner.nextLine());
        double pochivka = Double.parseDouble(scanner.nextLine());
        double obqd = (1.0 / 8) * pochivka;
        double otdih = (1.0 / 4) * pochivka;
        double left = pochivka - obqd - otdih;
        if (left >= epizod) {
            System.out.printf("You have enough time to watch %s and" +
                    " left with %.0f minutes free time.", name, Math.ceil(left - epizod));
        } else {
            System.out.printf("You don't have enough time to watch %s, you" +
                    " need %.0f more minutes.", name, Math.ceil(epizod - left));
        }
    }
}
