import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture01Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        double total = 0;
        List<String> furnitureCollection = new ArrayList<>();
        Pattern pattern = Pattern.compile(">>(?<name>[A-Za-z]+)<<(?<price>\\d+\\.?\\d+)!(?<count>\\d+)");
        while (!"Purchase".equals(input = scanner.nextLine())) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String fur = matcher.group("name");
                double pr = Double.parseDouble(matcher.group("price"));
                int co = Integer.parseInt(matcher.group("count"));
                double res = pr * co;
                total += res;
                furnitureCollection.add(fur);
            }
        }
        System.out.println("Bought furniture:");
        for (String string : furnitureCollection) {
            System.out.println(string);
        }
        System.out.printf("Total money spend: %.2f", total);
    }
}
