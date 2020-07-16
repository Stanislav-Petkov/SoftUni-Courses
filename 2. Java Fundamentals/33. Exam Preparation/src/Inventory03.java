import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Inventory03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] itemsArr = scanner.nextLine().split(", ");
        ArrayList<String> craftList = new ArrayList<>(Arrays.asList(itemsArr));
        String[] inputArr = scanner.nextLine().split(" - ");
        while (!inputArr[0].equals("Craft!")) {
            String item = inputArr[1];
            switch (inputArr[0]) {
                case "Collect":
                    if (!craftList.contains(item)) {
                        craftList.add(item);
                    }
                    break;
                case "Drop":
                    craftList.remove(item);
                    break;
                case "Combine Items":
                    String[] oldNew = inputArr[1].split(":");
                    String oldItem = oldNew[0];
                    String newItem = oldNew[1];
                    int oldItemIndex = 0;
                    if (craftList.contains(oldItem)) {
                        oldItemIndex = craftList.indexOf(oldItem);
                        craftList.add(oldItemIndex + 1, newItem);
                    }
                    break;
                case "Renew":
                    if (craftList.contains(item)) {
                        craftList.remove(item);
                        craftList.add(craftList.size(), item);
                    }
                    break;
            }
            inputArr = scanner.nextLine().split(" - ");
        }
        for (int i = 0; i < craftList.size(); i++) {
            System.out.print(craftList.get(i));
            if (i != craftList.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
