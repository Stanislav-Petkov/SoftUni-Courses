import java.util.Scanner;

public class PasswordGenerator06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int L = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i < a; i++) {
            for (int j = 1; j < a; j++) {
                for (char k = (char) 97; k < L + 97; k++) {
                    for (char p = (char) 97; p < L + 97; p++) {
                        for (int w = 1; w <= a; w++) {
                            if (w > i && w > j) {
                                System.out.print(i + "" + j + "" + k + "" + p + "" + w + " ");
                            }
                        }
                    }
                }
            }
        }
    }
}
