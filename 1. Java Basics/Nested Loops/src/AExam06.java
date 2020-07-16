import java.util.Scanner;

public class AExam06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.nextLine().charAt(0);
        int b = Integer.parseInt(scanner.nextLine());
        int last = Integer.parseInt(scanner.nextLine());
        for (int i = 65; i <= (int) c; i++) {
            for (int j = 1; j <= b; j++) {
                if (j % 2 != 0) {
                    for (int k = 97; k <= j + 97; k++) {
                        System.out.println((char) i + "" + j + "" + (char) k);
                        if (i > 65) {
                            System.out.println((char) i + "" + (j) + "" + (char) k);
                        }
                    }
                } else {
                    for (int k = 97; k <= j + 98; k++) {
                        System.out.println((char) i + "" + j + "" + (char) k);
                        if (i > 65) {
                            System.out.println((char) i + "" + (j + 1) + "" + (char) k);
                        }
                    }
                }
            }
        }
    }
}
