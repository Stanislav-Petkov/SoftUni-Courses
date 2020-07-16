
import java.util.Scanner;

class ConcatNames05Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.next();
        String name2 = scanner.next();
        String del = scanner.next();
        System.out.printf("%s%s%s%n", name1, del, name2);
    }
}