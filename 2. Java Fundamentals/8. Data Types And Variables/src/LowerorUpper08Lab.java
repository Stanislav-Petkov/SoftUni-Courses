
import java.util.Scanner;

class LowerorUpper08Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char name1 = scanner.next().charAt(0);
        if (Character.isUpperCase(name1)) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
