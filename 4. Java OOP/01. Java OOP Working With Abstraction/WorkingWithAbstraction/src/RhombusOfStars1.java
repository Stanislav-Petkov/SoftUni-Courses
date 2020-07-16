import java.util.Scanner;

public class RhombusOfStars1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int counter = n - 2;
        for (int i = 0; i < n; i++) { // rows from 0 to n
            for (int j = counter  ; j >= 0; j--) {
                System.out.print(" ");
            }
            counter--;
            for (int j = 0; j < i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int secCounter = n - 1;
        for (int i = 1; i < n; i++) { // rows from 0 to n
            for (int j = 0  ; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = secCounter; j > 0 ; j--) {
                System.out.print("* ");
            }
            secCounter--;
            System.out.println();
        }
    }
}
