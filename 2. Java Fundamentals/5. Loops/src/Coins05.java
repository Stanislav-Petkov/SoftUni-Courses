import java.util.Scanner;

public class Coins05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        double changeInCents = Math.floor(change * 100);
        int countCoins = 0;
        // 0.01, 0.02, 0.05,0.1,0.2,0.5,1,2
        while (changeInCents > 0) {
            if (changeInCents >= 200) {
                changeInCents -= 200;
            } else if (changeInCents >= 100) {
                changeInCents -= 100;
            } else if (changeInCents >= 50) {
                changeInCents -= 50;
            } else if (changeInCents >= 20) {
                changeInCents -= 20;
            } else if (changeInCents >= 10) {
                changeInCents -= 10;
            } else if (changeInCents >= 5) {
                changeInCents -= 5;
            } else if (changeInCents >= 2) {
                changeInCents -= 2;
            } else if (changeInCents >= 1) {
                changeInCents -= 1;
            } else {
                changeInCents = 0;
            }
            countCoins++;
        }
        System.out.println(countCoins);
    }
}
