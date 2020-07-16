import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName01Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern regex = Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]+\\b");
        String input = scanner.nextLine();
        Matcher matcher = regex.matcher(input);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
