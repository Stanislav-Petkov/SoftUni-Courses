import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber02Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        Pattern regex = Pattern.compile("\\+[3][5][9](( )|(-))[2](\\1)[0-9]{3}(\\1)[0-9]{4}\\b");
        Matcher matcher = regex.matcher(string1);
        List<String> matchedPhones = new LinkedList<>();
        while (matcher.find()) {
            matchedPhones.add(matcher.group());
        }
        System.out.println(String.join(", ", matchedPhones));
    }
}