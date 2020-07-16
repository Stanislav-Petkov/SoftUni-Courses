import java.util.Scanner;

public class Oscars05ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameFirst = scanner.nextLine();
        double pointsFirst = Double.parseDouble(scanner.nextLine());
        double ocenqvashti = Double.parseDouble(scanner.nextLine());
        String secondName = "";
        double secondPoints = 0;
        double result = 0;
        double currentPoints = pointsFirst;
        while (currentPoints < 1250.5) {
            for (int i = 0; i < ocenqvashti; i++) {
                secondName = scanner.nextLine();
                secondPoints = Double.parseDouble(scanner.nextLine());
                currentPoints = currentPoints + ((secondName.length() * secondPoints) / 2);
                if (currentPoints >= 1250.5) {
                    break;
                }
            }
            if (currentPoints <= 1250.5) {
                System.out.printf("Sorry, %s you need %.1f more!", nameFirst, 1250.5 - currentPoints);
            } else {
                System.out.printf("Congratulations, %s got a nominee " +
                        "for leading role with %.1f!", nameFirst, currentPoints);
            }
        }
    }
}
