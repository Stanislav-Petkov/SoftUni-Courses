import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aug19MessageEncrypter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        List<String> output = new ArrayList<>();
        Pattern regex = Pattern.compile("([*@])(?<tag>[A-Z][a-z]{2,})(\\1): (\\[(?<string1>[A-Za-z])\\]\\|)(\\[(?<string2>[A-Za-z])\\]\\|)(\\[(?<string3>[A-Za-z])\\]\\|)$");
        for (int i = 0; i < number; i++) {
            String message = scanner.nextLine();
            Matcher matcher = regex.matcher(message);
            String outputLine = "";
            if (matcher.find()) {
                String tag = matcher.group("tag");
                String s1 = matcher.group("string1");
                String s2 = matcher.group("string2");
                String s3 = matcher.group("string3");
                outputLine = (String.format("%s: %d %d %d", tag, (int) s1.charAt(0), (int) s2.charAt(0), (int) s3.charAt(0)));
            } else {
                outputLine = (String.format("Valid message not found!"));
            }
            output.add(outputLine);
        }
        System.out.println(String.join("\n", output));
    }
}
