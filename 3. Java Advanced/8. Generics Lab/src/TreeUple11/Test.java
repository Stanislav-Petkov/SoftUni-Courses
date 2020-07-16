package TreeUple11;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "not";
        boolean x = true;
        if (word.equals("drunk")) {
            x = false;
        } else if (word.equals("not")) {
            x = true;
        }
        System.out.println(x);
    }
}
