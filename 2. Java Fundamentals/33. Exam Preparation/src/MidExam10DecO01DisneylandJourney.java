import java.util.Scanner;

public class MidExam10DecO01DisneylandJourney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededMoney = Integer.parseInt(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double moneySaved = 0;
        for (int i = 1; i <= months; i++) {
            if (i % 4 == 0) {
                moneySaved += moneySaved * 0.25;
            }
            if ((i % 2 != 0) && (i != 1)) {
                moneySaved = moneySaved - (moneySaved * 0.16);
            }
            moneySaved += neededMoney * 0.25;
        }
        if (moneySaved >= neededMoney) {
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", moneySaved - neededMoney);
        } else {
            System.out.printf("Sorry. You need %.2flv. more.", Math.abs(moneySaved - neededMoney));
        }
    }
}
