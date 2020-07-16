import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while (n != -1) {
            sum += n;
            n = scanner.nextInt();
        }
        System.out.println(sum);
    }
}