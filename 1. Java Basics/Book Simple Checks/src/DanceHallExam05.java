import java.util.Scanner;

public class DanceHallExam05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double side = Double.parseDouble(scanner.nextLine());
        double hallArea = (length * 100) * (width * 100);
        double wardrobe = ((side * 100) * (side * 100));
        double benchArea = hallArea / 10;
        double freeSpace = hallArea - wardrobe - benchArea;
        double dancers = freeSpace / (40 + 7000);
        System.out.printf("%.0f", Math.floor(dancers));
    }
}