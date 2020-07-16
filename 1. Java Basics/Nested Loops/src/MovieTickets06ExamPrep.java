import java.util.Scanner;

public class MovieTickets06ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a1 = Double.parseDouble(scanner.nextLine());
        double a2 = Double.parseDouble(scanner.nextLine());
        double n = Double.parseDouble(scanner.nextLine());
        for (char i = (char) a1; i <= a2 - 1; i++) {
            for (int j = 1; j <= n - 1; j++) {
                for (int k = 1; k <= ((n / 2) - 1); k++) {
                    for (int l = (int) i; l <= (int) i; l++) {
                        if ((j + k + l) % 2 != 0 && i % 2 != 0) {
                            System.out.println(i + "-" + j + "" + k + "" + l);
                        }
                    }
                }
            }
        }
    }
}
