package Box1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String element = scanner.nextLine();
            GenericBox<Integer> box = new GenericBox<>(Integer.parseInt(element));
            System.out.println(box.toString());
        }
    }
}
