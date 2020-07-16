import java.util.Scanner;

public class BasicSyntax1EnglshNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit = Integer.parseInt(scanner.nextLine());
        int lastDigit = digit % 10;
        System.out.println(lastDigitWithWord(lastDigit));
    }

    private static String lastDigitWithWord(int lastDigit) {
        String name = "";
        switch (lastDigit) {
            case 0:
                name = "zero";
                break;
            case 1:
                name = "one";
                break;
            case 2:
                name = "two";
                break;
            case 3:
                name = "three";
                break;
            case 4:
                name = "four";
                break;
            case 5:
                name = "five";
                break;
            case 6:
                name = "six";
                break;
            case 7:
                name = "seven";
                break;
            case 8:
                name = "eight";
                break;
            case 9:
                name = "nine";
                break;
        }
        return name;
    }
}
