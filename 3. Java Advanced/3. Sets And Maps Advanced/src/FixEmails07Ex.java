import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FixEmails07Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("[A-Za-z]*\\@[A-Za-z]*\\.((([U]|[u])([k]|[K]))|(([U]|[u])([s]|[S]))|(([c]|[C])([o]|[O])([m]|[M])))$");
        LinkedHashMap<String, String> nameAndEmailMap = new LinkedHashMap<>();
        String name = "";
        while (!name.equals("stop")) {
            name = scanner.nextLine();
            if (name.equals("stop")) {
                break;
            }
            String email = scanner.nextLine();
            nameAndEmailMap.put(name, email);


        }
        for (Map.Entry<String, String> entry : nameAndEmailMap.entrySet()) {
            Matcher matcher = pattern.matcher(entry.getValue());
            if (!matcher.find()) {

                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }

        }
    }
}
