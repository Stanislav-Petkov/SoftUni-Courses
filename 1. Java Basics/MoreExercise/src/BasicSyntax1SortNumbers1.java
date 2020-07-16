import java.util.Arrays;
import java.util.Scanner;

public class BasicSyntax1SortNumbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            n = Integer.parseInt(scanner.nextLine());
            arr[i] = n;
        }
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
