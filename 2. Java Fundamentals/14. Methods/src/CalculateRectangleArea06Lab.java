import java.util.Scanner;

public class CalculateRectangleArea06Lab {
    static int returnRectangleArea(int length, int height) {
        return length * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int height = scanner.nextInt();
        int area = returnRectangleArea(length, height);
        System.out.println(area);
    }
}
