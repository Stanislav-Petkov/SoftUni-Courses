import java.util.Scanner;

public class ExtractFile03Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split("\\\\");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(".")) {
                String name = arr[i].substring(0, arr[i].indexOf("."));
                String extension = arr[i].substring(arr[i].indexOf(".") + 1);
                System.out.printf("File name: %s%n", name);
                System.out.printf("File extension: %s%n", extension);
            }
        }
    }
}
