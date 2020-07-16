import java.util.Scanner;

public class Money04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoin = Integer.parseInt(scanner.nextLine());
        double yuans = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine()) / 100;
        double yuansToDollar = yuans * 0.15;
        double yuansToLeva = yuansToDollar * 1.76;
        double result = (((bitcoin * 1168) + yuansToLeva) -
                (((bitcoin * 1168) + yuansToLeva) * commission)) / 1.95;
        System.out.println(result);
    }
}
