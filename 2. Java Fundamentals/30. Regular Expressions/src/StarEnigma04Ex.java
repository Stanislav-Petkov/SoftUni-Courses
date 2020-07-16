import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma04Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMessages = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int attackedPlanets = 0;
        int destroyedPlanets = 0;
        List<String> attackPlanets = new LinkedList<>();
        List<String> destroyPlanets = new LinkedList<>();
        Pattern regex = Pattern.compile("@(?<name>[A-Z][a-z]+)(([^@\\-!:>]?)+):(?<population>\\d+)(([^@\\-!:>]?)+)!(([^@\\-!:>]?)+)(?<type>A|D)(([^@\\-!:>]?)+)!(([^@\\-!:>]?)+)->(?<count>\\d+)");
        for (int i = 0; i < numberOfMessages; i++) {
            String input = scanner.nextLine();
            String[] encrypted = new String[input.length()];
            String[] decrypted = new String[input.length()];
            for (int j = 0; j < encrypted.length; j++) {
                encrypted[j] = String.valueOf(input.charAt(j));
                if (encrypted[j].equals("s") || encrypted[j].equals("S") || encrypted[j].equals("T") || encrypted[j].equals("t")
                        || encrypted[j].equals("a") || encrypted[j].equals("A") || encrypted[j].equals("r") || encrypted[j].equals("R")) {
                    count++;
                }
            }
            StringBuilder decryptedText = new StringBuilder();
            for (int j = 0; j < decrypted.length; j++) {
                char letter = (char) (input.charAt(j) - count);
                decrypted[j] = String.valueOf(letter);
                decryptedText.append(decrypted[j]);
            }
            Matcher matcher = regex.matcher(decryptedText);
            if (matcher.find()) {
                String type = matcher.group("type");
                if (type.equals("A")) {
                    attackedPlanets++;
                    attackPlanets.add(matcher.group("name"));
                }
                if (type.equals("D")) {
                    destroyedPlanets++;
                    destroyPlanets.add(matcher.group("name"));
                }
            }
            count = 0;
        }
        System.out.printf("Attacked planets: %d%n", attackedPlanets);
        Collections.sort(attackPlanets);
        for (int i = 0; i < attackPlanets.size(); i++) {
            System.out.print("-> ");
            System.out.println(attackPlanets.get(i));
        }
        System.out.printf("Destroyed planets: %d%n", destroyedPlanets);
        Collections.sort(destroyPlanets);
        for (int i = 0; i < destroyPlanets.size(); i++) {
            System.out.print("-> ");
            System.out.println(destroyPlanets.get(i));
        }
    }
}
