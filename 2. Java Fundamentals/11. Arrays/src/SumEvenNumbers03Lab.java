import java.util.Scanner;

public class SumEvenNumbers03Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numList = scanner.nextLine();
        String strArr[] = numList.split(" ");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        int sumEven = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0) {
                sumEven += numArr[i];
            }
        }
        System.out.println(sumEven);
    }
}
