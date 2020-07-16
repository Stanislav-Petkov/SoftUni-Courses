import java.util.Scanner;

public class NumberSequence06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = 0;
        int min = 0;
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > biggest) {
                biggest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("Max number: " + biggest);
        System.out.println("Min number: " + smallest);
    }
}
