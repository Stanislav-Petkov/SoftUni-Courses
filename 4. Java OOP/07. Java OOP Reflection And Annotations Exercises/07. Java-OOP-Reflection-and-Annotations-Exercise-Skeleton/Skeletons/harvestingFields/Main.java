
package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Field[] fields = RichSoilLand.class.getDeclaredFields();
        StringBuilder builder = new StringBuilder();
        while (!input.equals("HARVEST")) {
            for (Field field : fields) {
                int modifier = field.getModifiers();
                String modifierAsString = Modifier.toString(modifier);
                if (modifierAsString.equals(input) || input.equals("all")) {
                    builder.append(String.format("%s %s %s%n",
                            modifierAsString, field.getType().getSimpleName(), field.getName()));
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(builder.toString());
    }
}