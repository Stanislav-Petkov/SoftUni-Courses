import java.util.Scanner;

class CharstoString06Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char name1 = scanner.next().charAt(0);
        char name2 = scanner.next().charAt(0);
        char name3 = scanner.next().charAt(0);
        System.out.printf("%c%c%c", name1, name2, name3);
    }
}