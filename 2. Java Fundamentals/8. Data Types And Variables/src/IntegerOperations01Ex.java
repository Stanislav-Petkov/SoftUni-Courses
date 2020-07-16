
import java.util.Scanner;

class IntegerOperations01Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int n4 = Integer.parseInt(scanner.nextLine());
        int add = n1 + n2;
        int div = add / n3;
        int mul = div * n4;
        System.out.println(mul);
    }
}





