package recursiveDrawingTask2;

import java.util.Scanner;

public class RecursiveDrawing2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String drawStar = "*";
        for (int i = n; i >= 1; i--) {
            System.out.println(recursiveDrawing(i, drawStar));
        }

        String drawTag = "#";
        for (int i = 1; i <= n; i++) {
            System.out.println(recursiveDrawing(i, drawTag));
        }

        //iterativeDrawing(n);
    }

    private static String recursiveDrawing(int n, String drawStar) {
        if (n == 1) {
            return drawStar;
        }
        return drawStar + recursiveDrawing(n - 1, drawStar);
    }

    private static void iterativeDrawing(int n) {
        for (int i = n; i > 0; i--) {
            String draw = "";
            for (int j = i; j >= 1; j--) {
                draw += "*";
            }
            System.out.println(draw);
        }
        for (int i = 0; i < n; i++) {
            String draw = "";
            for (int j = 0; j <= i; j++) {
                draw += "#";
            }
            System.out.println(draw);
        }
    }
}
