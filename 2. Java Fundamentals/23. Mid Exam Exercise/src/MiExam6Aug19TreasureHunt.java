import java.util.List;

public class MiExam6Aug19TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] initialLootArr = scanner.nextLine().split("\\|");
        List<String> initialLootList = new ArrayList<>();
        for (int i = 0; i < initialLootArr.length; i++) {
            initialLootList.add(initialLootArr[i]);
        }
        List<String> arr2List = new ArrayList<>();
        String[] arr2Arr = scanner.nextLine().split(" ");
        for (int i = 0; i < arr2Arr.length; i++) {
            arr2List.add(arr2Arr[i]);
        }
        List<String> emptyList = new ArrayList<>();
        String[] emptyArr = new String[200];
        List<String> lastOutputValues = new ArrayList<>();
        while (!arr2Arr[0].equals("Yohoho!")) {
            if (arr2Arr[0].equals("Loot")) {
                for (int i = 1; i < arr2List.size(); i++) {
                    for (int j = 0; j < initialLootList.size(); j++) {
                        if (!initialLootList.contains(arr2List.get(i))) {
                            initialLootList.add(0, arr2List.get(i));
                        }
                    }
                }
            } else if (arr2Arr[0].equals("Drop")) {
                int indexForDrop = Integer.parseInt(arr2Arr[1]);
                if (!(indexForDrop > initialLootList.size()) && !(indexForDrop < 0)) {
                    initialLootList.add(initialLootList.get(indexForDrop));
                    initialLootList.remove(initialLootList.get(indexForDrop));
                }
            } else if (arr2Arr[0].equals("Steal")) {
                int indexForSteal = Integer.parseInt(arr2Arr[1]);
                while (indexForSteal > 0 || initialLootList.size() == 0) {
                    String lastArray = initialLootList.get(initialLootList.size() - 1);
                    lastOutputValues.add(lastArray);
                    initialLootList.remove(initialLootList.get(initialLootList.size() - 1));
                    indexForSteal--;
                    if (indexForSteal == 0) {
                        break;
                    }
                }
                for (int i = lastOutputValues.size() - 1; i >= 0; i--) {
                    System.out.print(lastOutputValues.get(i));
                    if (i != 0) {
                        System.out.print(", ");
                    }
                }
            }
            arr2List = emptyList;
            arr2Arr = emptyArr;
            arr2Arr = scanner.nextLine().split(" ");
            for (int i = 0; i < arr2Arr.length; i++) {
                arr2List.add(arr2Arr[i]);
            }
        }
        int elementSum = 0;
        int counterElements = 0;
        System.out.println();
        for (int i = 0; i < initialLootList.size(); i++) {
            String element = initialLootList.get(i);
            for (int j = 0; j < element.length(); j++) {
                elementSum++;
            }
            counterElements++;
        }
        if (initialLootList.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            System.out.printf("Average treasure gain: %.2f pirate credits.", elementSum * 1.0 / counterElements);
        }
    }
}
