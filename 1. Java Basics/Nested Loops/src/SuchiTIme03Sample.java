import java.util.Scanner;

public class SuchiTIme03Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kind = scanner.nextLine();
        String restoraunt = scanner.nextLine();
        double porciq = Double.parseDouble(scanner.nextLine());
        String simvol = scanner.nextLine();
        double price = 0;
        if (restoraunt.equals("Sushi Zone")) {
            if (kind.equals("sashimi")) {
                price = 4.99;
            } else if (kind.equals("maki")) {
                price = 5.29;
            } else if (kind.equals("uramaki")) {
                price = 5.99;
            } else if (kind.equals("temaki")) {
                price = 4.29;
            }
        } else if (restoraunt.equals("Sushi Time")) {
            if (kind.equals("sashimi")) {
                price = 5.49;
            } else if (kind.equals("maki")) {
                price = 4.69;
            } else if (kind.equals("uramaki")) {
                price = 4.49;
            } else if (kind.equals("temaki")) {
                price = 5.19;
            }
        } else if (restoraunt.equals("Sushi Bar")) {
            if (kind.equals("sashimi")) {
                price = 5.25;
            } else if (kind.equals("maki")) {
                price = 5.55;
            } else if (kind.equals("uramaki")) {
                price = 6.25;
            } else if (kind.equals("temaki")) {
                price = 4.75;
            }
        } else if (restoraunt.equals("Asian Pub")) {
            if (kind.equals("sashimi")) {
                price = 4.50;
            } else if (kind.equals("maki")) {
                price = 4.80;
            } else if (kind.equals("uramaki")) {
                price = 5.50;
            } else if (kind.equals("temaki")) {
                price = 5.50;
            }
        } else {
            System.out.printf("%s is invalid restaurant!", restoraunt);
        }
        if (simvol.equals("Y")) {
            price = (price * porciq) + ((price * porciq) * 0.2);
        } else {
            price = (price * porciq);
        }
        if (restoraunt.equals("Sushi Zone") || restoraunt.equals("Sushi Time") || restoraunt.equals("Sushi Bar") || restoraunt.equals("Asian Pub")) {
            System.out.printf("Total price: %.0f lv.", Math.ceil(price));
        }
    }
}
