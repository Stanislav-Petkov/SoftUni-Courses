import java.util.Scanner;

public class radianToDegree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = a * (180/Math.PI);
        System.out.println(Math.round(b));
    }
}
