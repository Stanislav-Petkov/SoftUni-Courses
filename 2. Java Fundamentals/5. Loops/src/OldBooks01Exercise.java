import java.util.Scanner;

public class OldBooks01Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String favBook = scanner.nextLine();
        int capacity = Integer.parseInt(scanner.nextLine());
        int checkedBooks = 0;
        boolean isFound = false;
        String currentBook = "";
        while (!isFound && capacity > checkedBooks) {
            currentBook = scanner.nextLine();
            if (currentBook.equals(favBook)) {
                isFound = true;
            } else {
                checkedBooks++;
            }
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.%n", checkedBooks);
        } else {
            System.out.printf("The book you search is not here!%n" +
                    "You checked %d books.", checkedBooks);
        }
    }
}