import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "S";
        char letter = (char) (s.charAt(0) - 3);
        System.out.println(letter);
        String res = String.valueOf(s.charAt(0) - 3);
        System.out.println(res);
    }
}
