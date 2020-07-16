import java.util.Scanner;

public class Building07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floor = Integer.parseInt(scanner.nextLine());
        int apartments = Integer.parseInt(scanner.nextLine());
        for (int i = floor; i > 0; i--) {
            for (int j = 0; j < apartments; j++) {
                if (i % 2 == 0) {
                    if (i == floor) {
                        System.out.printf("L%d%d ", i, j);
                    } else {
                        System.out.printf("O%d%d ", i, j);
                    }
                } else {
                    if (i == floor) {
                        System.out.printf("L%d%d ", i, j);
                    } else {
                        System.out.printf("A%d%d ", i, j);
                    }
                }
            }
            System.out.println();
        }
    }
}
