import java.util.Scanner;

public class ForeignLanguages6Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coutnry = scanner.nextLine();
        if (coutnry.equals("England") || coutnry.equals("USA")) {
            System.out.println("English");
        } else if (coutnry.equals("Spain") || coutnry.equals("Argentina")
                || coutnry.equals("Mexico")) {
            System.out.println("Spanish");
        } else
            System.out.println("unknown");
    }
}
