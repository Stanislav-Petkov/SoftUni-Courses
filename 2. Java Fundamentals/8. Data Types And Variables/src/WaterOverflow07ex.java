import java.util.Scanner;

public class WaterOverflow07ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int col = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            col = Integer.parseInt(scanner.nextLine());
            sum += col;
            if (sum > 255) {
                System.out.println("Insufficient capacity!");
                sum -= col;
            }
        }
        System.out.println(sum);
    }
}