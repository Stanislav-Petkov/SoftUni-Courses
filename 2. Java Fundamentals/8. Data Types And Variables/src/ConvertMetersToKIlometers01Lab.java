import java.util.Scanner;

public class ConvertMetersToKIlometers01Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double b = n / 1000.0;
        System.out.printf("%.2f", b);
    }
}
