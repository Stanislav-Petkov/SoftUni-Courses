import java.util.Scanner;

public class MultiplyBigNumber05Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bigNum = scanner.nextLine().replaceFirst("^0+(?!$)", "");
        if (bigNum.isEmpty()) {
            System.out.println(0);
            return;
        }
        int num = Integer.parseInt(scanner.nextLine());
        if (num == 0) {
            System.out.println(0);
            return;
        }
        int remainder = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = bigNum.length() - 1; i >= 0; i--) {
            int currentRes = 0;
            if (i == 0) {
                int remaining = Integer.parseInt(String.valueOf(bigNum.charAt(i))) * num + remainder;
                String preReverses = Integer.toString(remainder);
                String reversedNum = new StringBuffer(preReverses).reverse().toString();
                sb.append(reversedNum);
                break;
            }
            int multiplicationOfFirstDigit = Integer.parseInt(String.valueOf(bigNum.charAt(i))) * num;
            if (multiplicationOfFirstDigit + remainder < 10) {
                currentRes = multiplicationOfFirstDigit + remainder;
                sb.append(currentRes);
                remainder = 0;
            } else {
                currentRes = multiplicationOfFirstDigit + remainder;
                sb.append(currentRes % 10);
                currentRes /= 10;
                remainder = currentRes;
            }
        }
        System.out.println(sb.reverse());
    }
}
