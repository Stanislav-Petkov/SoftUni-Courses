
import java.util.Scanner;

public class TradeComissions08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commision = -1;
        if ("Sofia".equals(town)) {
            if (0 <= sales && sales <= 500) {
                commision = sales * 0.05;
            } else if (500 < sales && sales <= 1000) {
                commision = sales * 0.07;
            } else if (1000 < sales && sales <= 10000) {
                commision = sales * 0.08;
            } else if (sales > 10000) {
                commision = sales * 0.12;
            }
        } else if ("Varna".equals(town)) {
            if (0 <= sales && sales <= 500) {
                commision = sales * 0.045;
            } else if (500 < sales && sales <= 1000) {
                commision = sales * 0.075;
            } else if (1000 < sales && sales <= 10000) {
                commision = sales * 0.10;
            } else if (sales > 10000) {
                commision = sales * 0.13;
            }
        } else if ("Plovdiv".equals(town)) {
            if (0 <= sales && sales <= 500) {
                commision = sales * 0.055;
            } else if (500 < sales && sales <= 1000) {
                commision = sales * 0.08;
            } else if (1000 < sales && sales <= 10000) {
                commision = sales * 0.12;
            } else if (sales > 10000) {
                commision = sales * 0.145;
            }
        }
        if (commision >= 0) {
            System.out.printf("%.2f", commision);
        } else {
            System.out.println("error");
        }
    }
}
