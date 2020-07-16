
import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int volume = length * width * height;
        double litters = volume * 0.001;
        double percent1 = percent / 100;
        double emptySpace = (litters * (1 - percent1));
        System.out.printf("%.3f", emptySpace);
    }
}
