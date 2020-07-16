import java.util.Scanner;

public class CaesarCipher04Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] arr = input.toCharArray();
        char[] newArr = new char[arr.length];
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            char encrypted = (char) (arr[i] + 3);
            newArr[i] = encrypted;
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
        }
    }
}
