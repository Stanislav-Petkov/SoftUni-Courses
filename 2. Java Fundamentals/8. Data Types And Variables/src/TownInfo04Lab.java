
import java.util.Scanner;

class TownInfo04Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int n = scanner.nextInt();
        int n1 = scanner.nextInt();
        System.out.printf("Town %s has population of %d and area %d square km.", name, n, n1);
    }
}