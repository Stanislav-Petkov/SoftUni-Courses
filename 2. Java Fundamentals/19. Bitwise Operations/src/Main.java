import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double binary = 0b1011;
        System.out.println(binary);
        double hex1 = 0xF;
        System.out.println(hex1);
        double hex = 0263;
        System.out.println(hex);
        double num = -1000;
        String n = String.valueOf(num);
        n >> 1;
        System.out.println(n);
    }
}
