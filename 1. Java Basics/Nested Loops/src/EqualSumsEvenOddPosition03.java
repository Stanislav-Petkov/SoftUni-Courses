import java.util.Scanner;

public class EqualSumsEvenOddPosition03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        for (int i = num; i <= num2; i++) {
            String currentNum = "" + i;
            int evenSum = 0;
            int oddSum = 0;
            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                if (j % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
            }
            if (evenSum == oddSum) {
                System.out.print(" " + i);
            }
        }
    }
}
