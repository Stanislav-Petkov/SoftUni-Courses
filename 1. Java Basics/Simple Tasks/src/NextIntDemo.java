import java.util.Scanner;

public class NextIntDemo {
    public static void main(String[] args) {
        String s = "Hello WOrld. 3 _ 3.3  = tee";
        Scanner scanner = new Scanner(s);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                System.out.println("Found : " + scanner.nextInt());
            }
            System.out.println("Not Found: " + scanner.next());
        }
    }
}
