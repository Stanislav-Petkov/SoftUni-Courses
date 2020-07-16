import java.util.Scanner;

public class Coding02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputNum = scanner.nextLine();
        for (int index = inputNum.length() - 1; index >= 0; index--) {
            char symbol = inputNum.charAt(index);
            int SymbolAsNum = Integer.parseInt(symbol + "");
            int pos = SymbolAsNum + 33;
            if (SymbolAsNum == 0) {
                System.out.print("ZERO");
            }
            for (int times = 1; times <= SymbolAsNum; times++) {
                System.out.print((char) pos);
            }
            System.out.println();
        }
    }
}