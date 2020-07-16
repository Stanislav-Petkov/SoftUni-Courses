import java.util.Scanner;

public class Spaceship02Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double averageHeight = Double.parseDouble(scanner.nextLine());
        double rocketVolume = width * length * height;
        double roomVolume = (averageHeight + 0.4) * 2 * 2;
        double freeSpace = Math.floor(rocketVolume / roomVolume);
        if (freeSpace >= 3 && freeSpace <= 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", freeSpace);
        } else if (freeSpace < 3) {
            System.out.println("The spacecraft is too small.");
        } else if (freeSpace > 10) {
            System.out.println("The spacecraft is too big.");
        }
    }
}
