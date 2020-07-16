
import java.util.Scanner;

public class ExcellentorNot302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        if (n >= 5.5) {
            System.out.println("Excellent!");
        } else {
            System.out.println("Not Excellent.");
        }
    }
}
