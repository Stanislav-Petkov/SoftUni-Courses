import java.util.Scanner;

public class inchestocentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" inches = ");
        double inches = Double.parseDouble(scanner.nextLine());
        double centimeters = inches * 2.54;
        System.out.println(" Centimeters = " + centimeters);
    }
}
